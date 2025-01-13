import java.util.Scanner;
class VendingMachine{
    
    
    private int chocolate_amount;
    private double chocolate_price;
    private double chocolate_profit;
    private int brownie_amount;
    private double brownie_price;
    private double brownie_profit;
    private int milo_amount;
    private double milo_price;
    private double milo_profit; 
    private double balance;
    private int storage;
    private static int count = 0;
    private int ID;

    
    
    public VendingMachine(double chocolate_price, double chocolate_profit, double brownie_price, double brownie_profit, double milo_price, double milo_profit, double balance,int storage){
        this.chocolate_amount = 0;
        this.chocolate_price= chocolate_price;
        this.chocolate_profit = chocolate_profit;
        this.brownie_amount = 0;
        this.brownie_price = brownie_price;
        this.brownie_profit = brownie_profit;
        this.milo_amount = 0;
        this.milo_price = milo_price;
        this.milo_profit = milo_profit; 
        this.balance = balance;
        this.storage = storage;
        count++;
        this.ID = count;


    }
    
    public void display(){
        System.out.println("Chocolate amount: " + this.chocolate_amount + " | Chocolate price: " + this.chocolate_price + " | Brownie amount: " + this.brownie_amount + " | Brownie price: " + this.brownie_price + " | Milo amount: " + this.milo_amount + " | Milo Price: " + this.milo_price + " | Balance: " + this.balance);
    }

    public int getID(){
        return ID;
    }

    
    public static int getCount(){
        return count;
    }
         
    public void restock(String item, int amount){
        if (item.equals("chocolate")){
            if ((this.chocolate_amount + this.brownie_amount + this.milo_amount + amount) <= this.storage && this.balance >= this.chocolate_price * amount){
                this.balance = this.balance - (this.chocolate_price * amount);
                this.chocolate_amount += amount;
            }
            else{
                System.out.println("Not enough storage or money");
            }
        }
        else if(item.equals("brownie")){
            if ((this.chocolate_amount + this.brownie_amount + this.milo_amount + amount) <= this.storage && this.balance >= this.brownie_price * amount){
                this.balance = this.balance - (this.brownie_price * amount);
                this.brownie_amount += amount;
            }
            else{
                System.out.println("Not enough storage or money");
            }
            
        }
        else if(item.equals("milo")){
            if ((this.chocolate_amount + this.brownie_amount + this.milo_amount + amount) <= this.storage && this.balance >= this.milo_price * amount){
                this.balance = this.balance - (this.milo_price * amount);
                this.milo_amount += amount;
            } 
            else{
                System.out.println("Not enough storage or money");
            }
        }
        }

    public void sale(String item, int amount){
        if (item.equals("chocolate")){
            if (this.chocolate_amount >= amount){
                this.balance = this.balance + ((this.chocolate_profit + this.chocolate_price )* amount);
                this.chocolate_amount -= amount;
            }
            else{
                System.out.println("Not enough stock");
            }
        }
        else if(item.equals("brownie")){
            if (this.brownie_amount >= amount){ 
                this.balance = this.balance + ((this.brownie_profit+ this.brownie_price )* amount);
                this.brownie_amount -= amount;
            }
            else{
                System.out.println("Not enough stock");
            }
                
        }
        else if(item.equals("milo")){
              
            if (this.milo_amount >= amount){
                this.balance = this.balance + ((this.milo_profit + this.milo_price) * amount);
                this.milo_amount -= amount;
            }
            else{
                System.out.println("Not enough stock");
            }
        }
    }
    public void set_profit(String item, double profit){
        if (item.equals("chocolate")){
            this.chocolate_profit = profit;
        }
        else if(item.equals("brownie")){
            this.brownie_profit = profit;
            }
        else if(item.equals("milo")){
            this.milo_profit = profit;
        }
    } 
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        VendingMachine allen_machine = new VendingMachine(20, 10, 30, 10, 20, 10, 1000, 50);
        VendingMachine abc_machine = new VendingMachine(20, 10, 30, 10, 20, 10, 1000, 50);
        
        allen_machine.display();

        allen_machine.restock("brownie", 10);
        allen_machine.restock("chocolate", 10);
        allen_machine.restock("milo", 20);
        //allen_machine.set_profit("brownie", 20);
        //allen_machine.restock("chocolate", 10);
        //allen_machine.sale("brownie", 250);
        allen_machine.display();
        allen_machine.sale("milo", 2);
        allen_machine.sale("chocolate", 3);


        allen_machine.display();      
        System.out.println(allen_machine.getID());  
        System.out.println(abc_machine.getID());

        
    }
}


