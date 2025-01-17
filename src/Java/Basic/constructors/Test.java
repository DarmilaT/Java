package Java.Basic.constructors;

public class Test {
    public static void main(String[] args){
        classA objA = new classA();
        //  There are no “return value” statements in the constructor,
        //  but the constructor returns the current class instance.
        //  We can write ‘return’ inside a constructor.
        System.out.println(objA);
        objA.print();

        classB objB = new classB("Darmila", 2);
        System.out.println(objB);

        //overload constructors
        classB objB2 = new classB("Sheela");
        System.out.println(objB2);

        classB objB3 = new classB(3);
        System.out.println(objB3);

        //Copy Constructor
        // No in-build
        classB objCopy = new classB(objB);
        System.out.println(objCopy);

        // Constructor Chaining
        Temp temp = new Temp();
        System.out.println(temp);
    }
}
