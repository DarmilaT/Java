package Java.variables;

import java.util.ArrayList;

public class Casting {
    public static int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        //Implicit casting
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

        //Explicit casting
        double d = 9.78999d;
        int i = (int) d; // Manual casting: double to int

        System.out.println(d);   // Outputs 9.78
        System.out.println(i);      // Outputs 9

        String str = "7";
        //System.out.println((int) str); --> cann't cast
        System.out.println(Integer.parseInt(str));

        int ii = 40;
        //System.out.printf("%4.2f", ii); // IllegalFormatConversionException
        ArrayList<String > l = new ArrayList<>();
        l.add("h");
//        l.add(10);

        String s1 = (String) l.get(0);
        //String s2 = (String) l.get(1); //ClassCastException

//        Points p = new Points(1,1);
//        l.add((Object)s1);

        System.out.println(add(Integer.parseInt("8"), 6));


    }
}
