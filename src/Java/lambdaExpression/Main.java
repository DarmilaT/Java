package Java.lambdaExpression;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void printPersonsOlderThan(List<Person> people){
        for (Person p : people){
            if(p.getAge() < 23){
                p.printPerson();
            }
        }
    }
    public static void printPersonsWithinAgeRange(List<Person> people, int low, int high) {
        for (Person p : people){
            if(p.getAge() <= high && p.getAge() >= low){
                p.printPerson();
            }
        }
    }
    interface checkPerson {
        boolean test(Person p);
    }
    static class CheckPersonEligibleForSelectiveService implements checkPerson {
        @Override
        public boolean test(Person p) {
            return p.gender == Person.Sex.MALE &&
                    p.getAge() <= 25 &&
                    p.getAge() >= 18;
        }
    }
    public static void printPersons(List<Person> people, checkPerson tester){
        for (Person p : people){
            if(tester.test(p)){
                p.printPerson();
            }
        }
    }
    public static void printPersonsWithPredicate(List<Person> people, Predicate<Person> tester) {
        for (Person p : people){
            if(tester.test(p)){
                p.printPerson();
            }
        }
    }
    public static void processPersons(List<Person> people, Predicate<Person> tester, Consumer<Person> block){
        for (Person p : people){
            if(tester.test(p)){
                block.accept(p);
            }
        }
    }
    public static void main(String[] args) {
        List<Person> people = Person.generateDefaultList();
        // approach 1 - Create Methods That Search for Members That Match One Characteristic
        System.out.println("**Approach 1: Create Methods That Search for Members That Match One Characteristic**");
        printPersonsOlderThan(people);

        // approach 2 - Create More Generalized Search Methods
        System.out.println("**Approach 2: Create More Generalized Search Methods**");
        printPersonsWithinAgeRange(people, 20, 25);

        // approach 3 - Specify Search Criteria Code in a Local Class
        System.out.println("**Approach 3: Specify Search Criteria Code in a Local Class**");
        printPersons(people, new CheckPersonEligibleForSelectiveService());

        // approach 4 - Specify Search Criteria Code in an Anonymous Class
        System.out.println("**Approach 4: Specify Search Criteria Code in an Anonymous Class**");
        printPersons(people,
                new checkPerson() {
                    @Override
                    public boolean test(Person p) {
                        return p.gender == Person.Sex.MALE &&
                                p.getAge() <= 25 &&
                                p.getAge() >= 18;
                    }
                });

        // approach 5 - Specify Search Criteria Code with a Lambda Expression
        System.out.println("**Approach 5: Specify Search Criteria Code with a Lambda Expression**");
        printPersons(people,
                (Person p) -> p.gender == Person.Sex.MALE &&
                        p.getAge() <= 25 &&
                        p.getAge() >= 18);

        // approach 6 - Use Standard Functional Interfaces with Lambda Expressions
        System.out.println("**Approach 6: Use Standard Functional Interfaces with Lambda Expressions**");
        printPersonsWithPredicate(people,
                (Person p) -> p.gender == Person.Sex.MALE &&
                        p.getAge() <= 25 &&
                        p.getAge() >= 18);

        // approach 7 - Use Lambda Expressions Throughout Your Application
        System.out.println("**Approach 7: Use Lambda Expressions Throughout Your Application**");
        processPersons(people,
                p -> p.gender == Person.Sex.MALE &&
                        p.getAge() <= 25 &&
                        p.getAge() >= 18,
                Person::printPerson);

        // approach 8 - using streams
        System.out.println("Approach 8 - Using streams");
        people.stream()
                .filter(p-> p.gender == Person.Sex.MALE &&
                                p.getAge() <= 25 &&
                                p.getAge() >= 18)
                .forEach(System.out::println);
    }


}
