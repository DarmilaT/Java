package Java.Basic.accessModifiers.pack2;

import Java.Basic.accessModifiers.pack1.classA;

public class subClass extends classA {

    public subClass(String name, String password, int id, int salary) {
        super(name, password, id, salary);
    }
    public void printID(){
        System.out.println(id);
    }

    public static void main(String[] args){
        subClass objA = new subClass("Darmila", "123456", 1, 20000);
        objA.printID();
        System.out.println(objA.name);
//        System.out.println(objA.password);  error can't access
//        System.out.println(objA.id);
//        System.out.println(objA.salary);
    }
}
