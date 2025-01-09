package Java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        // Intermediate Operations
        // 1. map - return a stream consisting of the results of applying
        // the given function to the elements of this stream.
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2);
        List<Integer> square = numbers.stream()
                .map(x -> x*x).toList();
        System.out.println("numbers : " + numbers);
        System.out.println("Square of numbers : " +square);

        // 2. filter - select elements as per the Predicate passed as an argument.
        List<String> names = Arrays.asList("Reflection","Collection","Stream");
        List<String> resultOfFilter = names.stream()
                .filter(s -> s.startsWith("S")).toList();
        System.out.println("names : " + names);
        System.out.println("resultOfFilter : " + resultOfFilter);

        // 3. sorted - sort the stream.
        List<String> resultOfSorted = names.stream()
                .sorted().toList();
        System.out.println("resultOfSorted : " + resultOfSorted);

        // Terminal Operations
        // 1. collect - return the result of the intermediate operations performed on the stream.
        Set<Integer> squareSet = numbers.stream().map(x -> x*x).collect(Collectors.toSet());
        System.out.println("squareSet : " + squareSet);

        // 2. forEach - iterate through every element of the stream.
        numbers.stream().map(x -> x*x).forEach(System.out::println);

        // 3. reduce - reduce the elements of a stream to a single value.
        // The reduce method takes a BinaryOperator as a parameter.
        int even = numbers.stream().filter(x->x%2==0).reduce(0, Integer::sum);
        System.out.println("even : " + even);

    }
}
