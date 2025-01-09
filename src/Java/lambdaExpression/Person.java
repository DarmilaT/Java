package Java.lambdaExpression;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Person {
    public enum Sex {
        MALE, FEMALE
    }
    String name;
    LocalDate dob;
    Sex gender;
    String email;

    public Person() {
    }

    public Person(String name, LocalDate dob, Sex gender, String email) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.email = email;
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        int age = currentDate.getYear() - dob.getYear();

        // Check if the current date is before the person's birthday this year
        if (currentDate.getMonthValue() < dob.getMonthValue() ||
                (currentDate.getMonthValue() == dob.getMonthValue() &&
                        currentDate.getDayOfMonth() < dob.getDayOfMonth())) {
            age--; // Subtract 1 year if the birthday hasn't occurred yet this year
        }

        return age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                '}';
    }
    public void printPerson(){
        System.out.println(this.toString());
    }
    public static List<Person> generateDefaultList() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Shabbir", LocalDate.of(2000, 2, 20), Sex.MALE, "shabbir@gmail.com"));
        people.add(new Person("Nikhil", LocalDate.of(2003, 5, 10), Sex.MALE, "nikhil@gmail.com"));
        people.add(new Person("Shivam", LocalDate.of(1992, 10, 25), Sex.MALE, "shivam@gmail.com"));
        return  people;
    }
}
