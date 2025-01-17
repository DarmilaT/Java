package Java.Basic.accessModifiers.pack1;

public class subClassA extends classA{

    public subClassA(String name, String password, int id, int salary) {
        super(name, password, id, salary);
    }

    public static void main(String[] args){
        classA objA = new classA("Darmila", "123456", 1, 20000);
        System.out.println(objA.name);
//        System.out.println(objA.password);  error can't access
        System.out.println(objA.id);
        System.out.println(objA.salary);

    }
}
