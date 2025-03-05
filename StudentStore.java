import java.util.ArrayList;

class Employee {
    private String name;
    private boolean[] availability;
    private int shifts;

    public Employee(String name, boolean[] availability) {
        this.name = name;
        this.availability = availability;
        this.shifts = 0;
    }

    public String getName() {
        return name;
    }

    public boolean[] getAvailability() {
        return availability;
    }
    
    public int getShifts() {
        return shifts;
    }

    public void setShifts(int shifts) {
        this.shifts = shifts;
    }

    //public static void createSchedule(ArrayList<Employee> employees, ArrayList<ArrayList<String>> schedule) {
        
    //}
    
    public static void calculateAvailability(ArrayList<Employee> employees, ArrayList<Integer> sortedIndex, ArrayList<Integer> numAvailableShifts) {
        for (int i = 0; i < employees.size(); i++) {
            sortedIndex.add(i);
            int count = 0;
            for (boolean available : employees.get(i).availability) {
                if (available) count++;
            }
            numAvailableShifts.add(count);
        }
    
        for (int i = 0; i < sortedIndex.size() - 1; i++) {
            for (int j = i + 1; j < sortedIndex.size(); j++) {
                if (numAvailableShifts.get(sortedIndex.get(i)) > numAvailableShifts.get(sortedIndex.get(j))) {
                    int temp = sortedIndex.get(i);
                    sortedIndex.set(i, sortedIndex.get(j));
                    sortedIndex.set(j, temp);
                }
            }
        }
    }
    
    public static void setUpSchedule(ArrayList<ArrayList<String>> schedule) {
        for (int i = 0; i < 5; i++) {
            schedule.add(new ArrayList<>());
        }
    }
    
    public static void assignEmployeesToShifts(ArrayList<Employee> employees, ArrayList<ArrayList<String>> schedule, ArrayList<Integer> sortedIndex, ArrayList<Integer> numAvailableShifts) {
        int extraShifts = employees.size() % 5;
        int minShifts = employees.size() / 5;
    
        for (int i = 0; i < 5; i++) {
            for (int index : sortedIndex) {
                Employee emp = employees.get(index);
                if (emp.availability[i] && emp.shifts == 0) {
                    if (schedule.get(i).size() < minShifts) {
                        schedule.get(i).add(emp.name);
                        emp.shifts = 1;
                    } else if (extraShifts > 0 && schedule.get(i).size()<minShifts+1) {
                        schedule.get(i).add(emp.name);
                        emp.shifts = 1;
                        extraShifts--;
                    }
                }
            }
        }
    }
    
    public static void printSchedule(ArrayList<ArrayList<String>> schedule) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        for (int i = 0; i < 5; i++) {
            System.out.print(days[i] + ": ");
            System.out.println(schedule.get(i).isEmpty() ? "No one is available." : String.join(", ", schedule.get(i)));
        }
    }
    
}

public class StudentStore {
    private ArrayList<Employee> employees = new ArrayList<>();
    private ArrayList<ArrayList<String>> schedule = new ArrayList<>();
    
    public void hireEmployee(String name, boolean[] availability) {
        employees.add(new Employee(name, availability));
    }

    public void fireEmployee(String name) {
        boolean flag = false;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getName().equals(name)) { 
                employees.remove(i);
                System.out.println(name + " has been fired.");
                flag = true;
                break; 
            }
            
        }
        if (flag == false){
            System.out.println( name + " isn't an employee");
        }

    }

    public void createSchedule() {
        schedule.clear();
        ArrayList<Integer> sortedIndex = new ArrayList<>();
        ArrayList<Integer> numAvailableShifts = new ArrayList<>();
    
        Employee.calculateAvailability(employees, sortedIndex, numAvailableShifts);
        Employee.setUpSchedule(schedule);
        Employee.assignEmployeesToShifts(employees, schedule, sortedIndex, numAvailableShifts);
        Employee.printSchedule(schedule);
    }
    
    public static void main(String[] args) {
        StudentStore store = new StudentStore();
        store.hireEmployee("Alice", new boolean[]{false, true, true, true, true});
        store.hireEmployee("Bob", new boolean[]{true, true, true, true, true});
        store.hireEmployee("Charlie", new boolean[]{true, true, true, true, true});
        store.hireEmployee("David", new boolean[]{true, true, true, true, false});
        store.hireEmployee("Eve", new boolean[]{true, true, true, true, true});
        store.hireEmployee("Frank", new boolean[]{true, true, true, true, true});
        store.hireEmployee("Grace", new boolean[]{false, true, true, false, false});
        store.hireEmployee("Hank", new boolean[]{true, false, true, true, true});
        store.hireEmployee("Ivy", new boolean[]{false, true, true, true, false});
        store.hireEmployee("Jack", new boolean[]{true, true, true, true, false});
        store.hireEmployee("Kara", new boolean[]{true, true, false, true, false});
        store.hireEmployee("Liam", new boolean[]{false, true, true, false, false});
        store.hireEmployee("Mia", new boolean[]{true, true, true, true, true});
        store.hireEmployee("Noah", new boolean[]{true, true, true, true, true});
        store.hireEmployee("Olivia", new boolean[]{true, false, false, false, false});
        store.hireEmployee("Paul", new boolean[]{true, true, true, true, true});
        store.hireEmployee("Quinn", new boolean[]{true, true, false, true, false});
        store.fireEmployee("Quinn");
        store.createSchedule();
    }
}
