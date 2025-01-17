package Java.Basic.constructors;

public class Temp {
    int x;
    int y;
    Temp(){
        this(5);
        System.out.println("The default constructor");
    }

    // parameterized constructor 2
    Temp(int x){
        this(4,5);
        this.x = x;
        System.out.println("The constructor 2");
    }

    Temp(int x, int y){
        this.x = x;
        this.y = y;
        System.out.println("The final constructor");
    }

    @Override
    public String toString() {
        return "Temp{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
