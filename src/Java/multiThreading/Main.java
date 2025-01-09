package Java.multiThreading;

public class Main {
    public static void main(String[] args) {
//        MyThread1 t1 = new MyThread1();
//        t1.start();

        int n =8;
        for (int i=0; i<n; i++){
            Thread object = new Thread(new MyThread2());
            object.start();
            /*
            Runnable obj = new MyThread2();
            obj.run();
            */   // this is default way of creating object this is not achieve the purpose of threads
        }
    }
}
