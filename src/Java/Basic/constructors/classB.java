package Java.Basic.constructors;

public class classB {
    String name;
    int id;

    // Parameterized Constructor
    classB(String name, int id){
        this.name = name;
        this.id = id;
    }

    //overload constructors
    classB(String name){
        this.name = name;
    }

    classB(int id){
        this.id = id;
    }

    // Copy Constructor
    classB(classB obj){
        this.name = obj.name;
        this.id = obj.id;
    }

    @Override
    public String toString() {
        return "classB{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
