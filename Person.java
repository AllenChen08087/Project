public class  Person extends Object{

    private int age;
    private String name;
    
    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void displayinfo(){
        System.out.print("Age: " + this.age + " name: " + this.name );
    }

    @Override
    public String toString(){
        return ("Age: " + this.age + " name: " + this.name );

    }

    @Override
    public boolean equals(Object obj) {
        Person p = (Person) obj;
        return (this.name.equals(p.name) && this.age == p.age);
    }

    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int num){
        this.age = num;
    }
    public void setName(String name){
        this.name = name;
    }

}

//Studenttttt
/* 
class  Student extends Person{

    private int grade_level;
    public Student(int grade_level, int age, String name){
        super(age, name);
        this.grade_level = grade_level;
    }

    @Override
    public void displayinfo(){
        super.displayinfo();
        System.out.println("Grade level: " + this.grade_level);
    }

    public int getGrade(){
        return this.grade_level;
    }
    public void setGrade(int new_grade){
        this.grade_level = new_grade;
    }
    
}
*/

