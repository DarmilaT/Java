package Java.oop;

public class PEOPLESaccount extends BankAccount  {
    double balance;
    public PEOPLESaccount(double balance){
        super(balance);
    }
    public double deposit(double amount){
        return balance+amount;
    }
    public double withdraw(double amount){
        return balance-amount;
    }
    public double transferAmount(){
        int rate = 20;
        return (balance*rate)/100;
    }
}
