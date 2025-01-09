package Java.oop;

public class BOCaccount extends BankAccount  {
    double balance;
    public BOCaccount(double bal){
        super(bal);
    }
    public double deposit(double amount){
        return balance+amount;
    }
    public double withdraw(double amount){
        return balance-amount;
    }
    public double transferAmount(){
        int rate = 10;
        return (balance*rate)/100;
    }
}
