package Java.exceptionHandle;

public class InsufficientException extends Exception {
    double amount;
    InsufficientException(double amt){
        this.amount = amt;
    }
}
