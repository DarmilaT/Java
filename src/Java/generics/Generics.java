package Java.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//import java.util.ArrayList;
//import java.util.List;
public class Generics {
    public static <T> void gMethod(T item){
        System.out.println(item);
    }
    public static void main(String[] args){
        //  Generics does not work with primitive types (int, float, char, etc).

        // here no type safety we can add any type of values
//        ArrayList values;
//        values = new ArrayList();
//        values.add(85);
//        values.add("Aasha");
//        List<Integer> values1 = new ArrayList<Integer>();
//        values1.add(99);
//
//        Container<Double> obj = new Container<>();
//        obj.value = 10.2 ;
//        obj.show();
////        obj.demo(new ArrayList<Integer>);

        var list = new Lists();
        list.add(1); // during compile int(1) --> Integer.valueOf(1)
        // because this value is primitive type but in object only has wrapper classes
        // Like Integer, Double, Boolean
        list.add("123");
        // what are the problems when we use object type?
        //problem 1
        //int number = list.get(0); --> get error
        // to solve this we use casting
        int number = (int)list.get(0); // it makes little bit noisy of our code
        //problem 2
        // int number2 = (int)list.get(1); --> ClassCastException
        // this is a run time exception we can't identify this during compile time
        // we can only identify this problem at run time
        // if we could cache these problem at compile time, it will be grateful

        // Generics Class
        GenericList<Integer> gl1 = new GenericList<>();
        GenericList<Integer> gl2 = new GenericList<>(Integer.valueOf(88)); // Not need to casting here
        GenericList<Integer> gl3 = new GenericList<>(88);
        gl1.add(56); // boxing
        int num = gl1.get(0); // unboxing
        int num3 = gl2.get(0).intValue(); // this casting also not needed
        // so the benefit, we get compile time type safety here

        // Generic method
        gMethod(10);
        gMethod("String");

        //wildcard parameterized
        //The <?> indicates that you are using an unbounded wildcard,
        // which means that the type parameter can be any type, but its actual type is unknown at compile time.
        ArrayList<?> l = new ArrayList<>();
        //l = new ArrayList<String>(); // This is allowed

        // Adding elements to the list (works with any type)
        l.add(null); // You can add null to a wildcard list
//        l.add(469);
//        l.add("469");
        // Accessing elements (returns Object)
        Object element = list.get(0);

        LinkedList<Integer> ll11 = new LinkedList<>();
        ll11.add(50);
        ll11.add(82);
        System.out.println(ll11.peek());

        // Generic class with two type parameters
        TwoGen<Integer, String> tg1 = new TwoGen<>(12, "Hello");
        System.out.println(tg1.getOb1());
        System.out.println(tg1.getOb2());

        //Bounded Types
        Integer[] numbs = {12, 45, 85, 96};
        Stats<Integer> s = new Stats<>(numbs);
        System.out.println(s.average());
        // This will not compile
//        String[] numbs1 = {"12", "45", "85", "96"};
//        Stats<String> s1 = new Stats<>(numbs1);

        Double[] numbs1 = {12.0, 45.0, 85.0, 96.0};
        Stats<Double> s1 = new Stats<>(numbs1);
        System.out.println(s1.average());

        System.out.println(s1.sameAvg(s));

        print("Hi", 22);
        System.out.println(print2("hello", 55));

        List<Integer> intList = new ArrayList<>();
        intList.add(22);
        intList.add(55);
        printList(intList);

    }
    private static <T, U> void print(T t, U u){
        System.out.println(t + " " + u);
    }
    private static <T, U> T print2 (T t, U u){
        System.out.println(t + " " + u);
        return t;
    }
    private static void printList(List<? extends Number> list){
        System.out.println(list);
    }
}
