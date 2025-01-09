package Java.multiThreading;

import java.util.Arrays;

public class MyThread1 extends Thread{
    int[] values = {10, 5, 8, 6};
    public void run() {
        System.out.println("MyThread1 " + Thread.currentThread().threadId() + " is running");
        Arrays.stream(values).map(x -> 2*x).forEach(System.out::println);
    }
}
