package Java.Basic.accessModifiers.pack2;

//import Java.Basic.accessModifiers.pack1.SampleClass;

import Java.Basic.accessModifiers.pack1.classA;

public class Main {
    public static void main(String[] args){
//        SampleClass obj = new SampleClass();
//        obj.output();

        classA objA = new classA("Darmila", "123456", 1, 20000);
        System.out.println(objA.name); // public
        /*
            Outside the package only *public* can visible
        */
//        System.out.println(objA.password);  error can't access // private
//        System.out.println(objA.id); // protected
//        System.out.println(objA.salary);

    }
}
