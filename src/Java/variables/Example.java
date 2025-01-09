package Java.variables;

// class scope
public class Example {
     int salary; // Instance Variable
    static int pin; // static variable
    final int n = 10;

    public void show() {
        int value = 2; // Local variable
        value = value + 10;
        System.out.println("The Value is : " + value);
        salary = 10000;
        System.out.println("The salary is : " + salary);

    }

    // method scope
    public static void m1() {
        int v = 10;
        System.out.println(pin);
//      salary = 1000;
        {
            // Block scope
            int a = 10;
            v = a + 20;
        }
        System.out.println(v);
    }

    public static void main(String args[]) {
        Example eg = new Example();
        eg.show();
        System.out.println("Static variable pin " + pin);
        // static int pin = 45;
        System.out.println("Static variable pin " + pin);
//        System.out.println("Static variable salary " +salary); --> Error
        m1();

    }
}
