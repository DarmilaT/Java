package Java.lambdaExpression.methodReference;

import Java.stream.Employee;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class MethodReferenceExamples {
    public static <T> T mergeThings(T a, T b, BiFunction<T, T, T> merger) {
        return merger.apply(a, b);
    }
    // static method
    public static String appendStrings(String a, String b) {
        return a + b;
    }
    // non-static method
    public String appendStrings2(String a, String b) {
        return a + b;
    }
    @FunctionalInterface
    interface funInterface1 {
        Employee get();
    }
    @FunctionalInterface
    interface funInterface2 {
        Employee get(String name);
    }
    public static class Employee {
        String name;
        Employee(){
            System.out.println("Empty Constructor");
        }
        Employee(String name) {
            System.out.println("Name Constructor");
            this.name = name;
        }

        public String toString() {
            return "name: " + name;
        }
    }
    public static void main(String[] args) {
        MethodReferenceExamples methodReferenceExObj = new MethodReferenceExamples();
        // Calling the method mergeThings with a lambda expression
        System.out.println(mergeThings("Hello ", "World!", (a, b) -> a + b));

        // Reference to a static method
        // 1. containingClass::staticMethodName
        System.out.println(mergeThings("Hello", "World!", MethodReferenceExamples::appendStrings));

        // Reference to an instance method of a particular object
        // 2. containingObject::instanceMethodName
        System.out.println(mergeThings("Hello", "World!", methodReferenceExObj::appendStrings2));

        // Reference to an instance method of an arbitrary object of a particular type
        // 3. containingType::methodName
        System.out.println(mergeThings("Hello", "World!", String::concat));

        // Reference to a constructor
        // 4. className::new
//        List<Integer> list = ArrayList::new; // compile error - List not a functional Interface
        funInterface1 emptyEmployee = Employee::new;
        System.out.println(emptyEmployee.get());

        funInterface2 employeeRaja = Employee::new;
        System.out.println(employeeRaja.get("Raja"));
    }
}
