import java.util.Scanner;
public class Class{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        BankAccount allen_acc = new BankAccount("Allen", 1234, 0);
        System.out.println(allen_acc.getBalance());

    }
    
}
class BankAccount{

    private String owner;
    private int password;
    private double balance;
    
    public BankAccount(String owner, int password, double balance){
        this.owner = owner;
        this.password = password;
        this.balance = balance;
    }

    public void deposit(double amount){
        this.balance = balance + amount;
    }
    public withdraw(double amount){
        this.balance = balance - amount;
    }
    public String getOwner(){
        return (this.owner);
    }
    public int getBalance(){
        return (this.balance);
    }
    public int getPasssword(){
        return (this.password);
    }
    public void setPassword(int newPass){
        this.pssword = newPass;
    }

}

