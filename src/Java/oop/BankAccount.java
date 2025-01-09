package Java.oop;
public abstract class BankAccount implements Transactions, interface1, interface2 {
    private double balance;
    public BankAccount(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public abstract double deposit(double amount);
    public abstract double withdraw(double amount);
    public abstract double transferAmount();
}
