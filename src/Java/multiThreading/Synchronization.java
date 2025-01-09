package Java.multiThreading;

class MathService {
//    void getSumOfArray(int[] numbers) {
//        // synchronized block
//        synchronized (this){
//            int sum = 0;
//
//            for (int number : numbers) {
//                System.out.println(Thread.currentThread()
//                        .getName()
//                        + " adds "
//                        + sum + " to "
//                        + number + " to get -> "
//                        + (sum += number));
//
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }
//    }
    static synchronized  void getSumOfArray(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            System.out.println(Thread.currentThread()
                    .getName()
                    + " adds "
                    + sum + " to "
                    + number + " to get -> "
                    + (sum += number));

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Synchronization {
    public static void main(String[] args) {
        MathService mathService = new MathService();
        MathService mathService1 = new MathService();

        Thread threadOne = new Thread(() ->
                mathService.getSumOfArray(new int[]{10, 11, 12}));
        Thread threadTwo = new Thread(() ->
                mathService.getSumOfArray(new int[]{20, 21, 22}));
        Thread threadThree = new Thread(() ->
                mathService1.getSumOfArray(new int[]{10, 11, 12}));
        Thread threadFour = new Thread(() ->
                mathService1.getSumOfArray(new int[]{20, 21, 22}));

//        threadFour.setPriority(Thread.MAX_PRIORITY);
//        threadOne.setPriority(Thread.MIN_PRIORITY);
//        threadTwo.setPriority(Thread.MIN_PRIORITY);
//        threadThree.setPriority(Thread.MIN_PRIORITY);
        threadOne.start();
        threadTwo.start();
        threadThree.start();
        threadFour.start();
    }
}
