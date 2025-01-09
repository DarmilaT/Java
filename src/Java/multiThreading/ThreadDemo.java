package Java.multiThreading;
class Hi extends Thread {
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
class Hello extends Thread {
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
public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Hi hi = new Hi();
        hi.start();
        Hello hello = new Hello();
        hello.start();
    }
}
