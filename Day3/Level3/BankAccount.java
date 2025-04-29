package Level3;
import java.util.*;
public class BankAccount {
    String accountNumber;
    protected String accountHolder;
    private float balance;
    //setter for private
    public void  setBalance(float balance){
        this.balance=balance;
    }
    //getter for private
    public float getBalance(){
        return this.balance;
    }
    //setter for protected
    public void  setAccountHolder(String accountHolder){
        this.accountHolder=accountHolder;
    }
    //getter for protected
    public String getAccountHolder(){
        return this.accountHolder;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        BankAccount ba=new BankAccount();
        System.out.println("Enter the Account Number: ");
        ba.accountNumber=sc.nextLine();
        SavingsAccount sa=new SavingsAccount();
        System.out.println("Enter the Account Holder Name: ");
        sa.setAccountHolder(sc.nextLine());
        System.out.println("Enter the balance amt: ");
        ba.setBalance(sc.nextFloat());
        System.out.println(" Account Number is:"+ba.accountNumber);
        System.out.println("Acc Holder name is :"+sa.getAccountHolder());
        System.out.println("Balance amt is Rs."+ba.getBalance());
    }
}
class SavingsAccount extends BankAccount{

}
