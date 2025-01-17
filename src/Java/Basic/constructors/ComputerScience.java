package Java.Basic.constructors;

public class ComputerScience extends Subject{
    ComputerScience(){
        super();
        System.out.println("Default in CS");
    }

    ComputerScience(String name, int id){
        super(name, id);
        System.out.println("second constructor");
    }

    public static void main(String[] args){
        ComputerScience cs = new ComputerScience();
        ComputerScience cs2 = new ComputerScience("CS", 12);
        System.out.println(cs2);
    }
}
