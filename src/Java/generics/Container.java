package Java.generics;

public class Container<T extends Number> {
    // if we want to use this for specific data types we can use as bounded type
    T value;

    // Now, this will support only for Number class(integer, double, Byte...)
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void show() {
        System.out.println(value.getClass());
        System.out.println(value.getClass().getName());
    }
//    public void demo(ArrayList<T>){
//
//    }
}
