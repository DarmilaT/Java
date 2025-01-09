package Java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Examples {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("John", "Martin", "Mary",
                "Steve");
        stringList.stream()
                .map((s) -> s.toUpperCase())
                .forEach(System.out::println);

        Stream<String> nameStream =
                Stream.of("mohan","john","Vaibhav","amit", "Java");
        Stream<String> nameStartJ =
                nameStream.map(
                                (s) ->
                                {
                                    System.out.println("Map: "+s);
                                    return s.toUpperCase();
                                })
                        .filter(
                                (s) ->
                                {

                                    System.out.println("Filter: "+s);
                                    return
                                            s.startsWith("J");
                                }
                        );
        //System.out.println(nameStartJ);
        Optional<String> findAny =
                nameStartJ.findAny();
        System.out.println("Final output: "+findAny.get());

    }
}
