package Java.nestedClasses;

public class OuterClass {
    String outerField = "Outer Field";
    static String staticOuterField = "Static Outer Field";

    class InnerClass {
        void accessMembers() {
            // we can access the static & non-static members of outer class from inner class
            System.out.println(outerField);
            System.out.println(staticOuterField);
        }
    }

    static class StaticNestedClass {
        void accessMembers(){
            /*
 we can only access static members of outer class from static nested class
            System.out.println(outerField); // compile error
            System.out.println(OuterClass.outerField); // compile error
*/
            System.out.println(staticOuterField);
            System.out.println(OuterClass.staticOuterField);
        }

        void accessMembers(OuterClass outer){
            System.out.println(outer.outerField);
        }
    }

    public static void main(String[] args) {
        // Instantiate Outer class
        OuterClass outerObject = new OuterClass();

        // Instantiate Inner class
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();
        innerObject.accessMembers();

        // Instantiate static nested class
        StaticNestedClass staticNestedObject = new StaticNestedClass();
        staticNestedObject.accessMembers();
        staticNestedObject.accessMembers(outerObject);
    }
}
