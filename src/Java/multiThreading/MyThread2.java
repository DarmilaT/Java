package Java.multiThreading;

import java.util.stream.Stream;
// Runnable is a functional Interface
public class MyThread2 implements Runnable{
    @Override
    public void run() {
        System.out.println("MyThread2 " + Thread.currentThread().threadId() +
                " is running");
    }
}
