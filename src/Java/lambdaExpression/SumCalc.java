package Java.lambdaExpression;

interface Calculator<T>{
    public T add(T a, T b);
}
class demo{
    public static void main(String[] args) {
        new Calculator<Double>(){
            @Override
            public Double add(Double a, Double b) {
                return a+b;
            }
        };

        Calculator<Double> sum = (a,b) -> a+b;
    }
}
public class SumCalc implements Calculator<Double>{
    @Override
    public Double add(Double a, Double b) {
        return a+b;
    }
}
