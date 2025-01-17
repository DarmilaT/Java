package Java.Basic.accessModifiers.pack1;

public class Main {
    public static void main(String[] args){
        SampleClass obj = new SampleClass();
        obj.output();

        classA objA = new classA("Darmila", "123456", 1, 20000);
        System.out.println(objA.name); // public
//        System.out.println(objA.password);  // private - error can't access
        System.out.println(objA.id); // protected
        System.out.println(objA.salary); // default
    }
}
