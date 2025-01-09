package Java.multiThreading.forkJoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class Factorial extends RecursiveTask {
    private volatile long number;
    public Factorial(long number){
        this.number = number;
    }
    @Override
    protected Object compute() {
        long n = number;
        if(n <= 1){
            number = fact(n);
        } else {
            Factorial f1 = new Factorial(n-1);
            ForkJoinTask.invokeAll(f1);
            number = f1.number * number;
        }
        return number;
    }

    private long fact(long n) {
        if(n<=1) return 1;
        else return fact(n-1);
    }

    public static void main(String[] args) {
        Factorial f = new Factorial(10);
        System.out.println(new ForkJoinPool().invoke(f));
    }
}
