package Java.multiThreading;
import static java.lang.Thread.sleep;
public class ThreadDemoWithLambda {
    public static void main(String[] args) throws InterruptedException {
        // Here we use the Object hi one time so, We can create that as anonymous class
        // Using AnonymousClass with functional Interface
        Runnable hi = new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hi: " + Thread.currentThread().threadId());
                    try {
                        sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        Thread th1 = new Thread(hi);
        th1.start();

        // Runnable is a functional interface so, we can replace this with lambda expression
        Thread th2 = new Thread(() -> {
            for(int i=0; i<5; i++){
                System.out.println("Hello: " + Thread.currentThread().threadId());
                try {
                    sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "Hello Thread");
        System.out.println(th2.getName());
        // range of priority is 1 to 10
        th2.setPriority(Thread.MIN_PRIORITY);
        System.out.println(th2.getPriority());
        th2.start();
    }
}
