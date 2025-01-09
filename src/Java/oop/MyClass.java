package Java.oop;

public class MyClass<T> {
    int d = 0;
    protected int  p = 10;
    private int  pr = 90;
    public  int global = 0;
//    public static class subclass{
//        MyClass<Integer> m = new MyClass<>();
//        int g = m.d;
//
//    }



    private  T os;

    public void setOs(T value) {
        os = value;
    }

    public T getOs() {
        global = 4;
        d = 9;
        return os;
    }

    public static void main(String[] args) {
        MyClass<String> stringInstance = new MyClass<>();
        stringInstance.setOs("Windows");

        MyClass<Integer> integerInstance = new MyClass<>();
        integerInstance.setOs(10);

        System.out.println("String instance OS: " + stringInstance.getOs());
        System.out.println("Integer instance OS: " + integerInstance.getOs());
//        global = 4; cann't use
//        d = 4;
    }
}
