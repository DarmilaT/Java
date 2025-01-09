package Java.multiThreading;

import static java.lang.Thread.sleep;

class Hi2 implements Runnable {
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println("Hi: " + Thread.currentThread().threadId());
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
class Hello2 implements Runnable {
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println("Hello: " + Thread.currentThread().threadId());
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class ThreadDemoWithInterface {
    public static void main(String[] args) throws InterruptedException {
        Hi2 hi = new Hi2();
        Thread th1 = new Thread(hi);
        th1.start();
        Hello2 hello = new Hello2();
        Thread th2 = new Thread(hello);
        th2.start();
    }
}
