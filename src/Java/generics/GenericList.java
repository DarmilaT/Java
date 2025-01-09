package Java.generics;

public class GenericList<T> {
    // T - Place holder
//    T – Type
//    E – Element
//    K – Key
//    N – Number
//    V – Value
    private static int os;
    GenericList(){
    }
    private T[] items = (T[]) new Object[10]; // array can't instantiate this array doesn't know about type
    private int count;
    GenericList(T o){
        items[0] = o;
        count++;
    }

    public void add(T item){
        items[count++] = item;
    }
    public T get(int index){
        return items[index];
    }
}
