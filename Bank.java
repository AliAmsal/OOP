
package bank;

class BankCustomer
{
    public String Name;
    public int AccNum;
    private double balance;
    public void setValues(String a, int n, int b)
    {
        Name = a;
        AccNum = n;
        balance = b;
    }
    public void displayBalance()
    {
        System.out.println(balance);
    } 
    public void deposit(double x)
    {
        balance += x;
    }
    public void withdraw(double x)
    {
        if(balance >= x)
            balance -= x;
        else
            System.out.println("Not enough money :( ");
    }
    
}

public class Bank {

   
    public static void main(String[] args) {
        BankCustomer Customer1 = new BankCustomer();
        Customer1.setValues("Ali", 1, 1000);
        Customer1.deposit(2000);
        Customer1.displayBalance();
        Customer1.withdraw(5000);
        Customer1.withdraw(2500);
        Customer1.displayBalance();
    }
    
}
