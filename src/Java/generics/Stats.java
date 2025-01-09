package Java.generics;

// Bounded Types
public class Stats<T extends Number> {
    // In addition to using class type as a bound, you can use also an interface type
    T[] num;
    Stats(T[] o){
        num = o;
    }
    double average(){
        double sum = 0;
        for (T x : num){
            sum = x.doubleValue();
        }
        return sum / num.length;
    }
    // Using wildcard Arguments
    boolean sameAvg(Stats<?> ob){
        return average() == ob.average();
    }
    // 'sameAvg(Java.generics.Stats<java.lang.Double>)' in 'Java.generics.Stats' cannot be applied to '(Java.generics.Stats<java.lang.Integer>)'
}
