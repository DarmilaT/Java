package Java.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiDemo {
    static List<Employees> employees = new ArrayList<>();
    static {
        employees.add(
                new Employees("Darmila", "Thiru", 30000.0, List.of("Project 1", "Project 2"))
        );
        employees.add(
                new Employees("Sana", "Samir", 45000.0, List.of("Project 3", "Project 2"))
        );
        employees.add(
                new Employees("Shivam", "Aarumugam", 35000.0, List.of("Project 4", "Project 1"))
        );
        employees.add(
                new Employees("Keerththana", "Vasudevan", 25000.0, List.of("Project 1", "Project 3"))
        );
    }

    public static void main(String[] args) {
        //Stream.of(employees); -same- employees.stream()

        // foreach
        employees.forEach(System.out::println);


        // map
        // collect
        List<Employees> increasedSal = employees.stream()
                .map(employees -> new Employees(
                        employees.getFirstName(),
                        employees.getLastName(),
                        employees.getSalary()*1.10,
                        employees.getProjects())).toList();
        System.out.println("increasedSal : " +increasedSal);

        // set
        // collect
        Set<Employees> increasedSalSet = employees.stream()
                .map(employees -> new Employees(
                        employees.getFirstName(),
                        employees.getLastName(),
                        employees.getSalary()*1.10,
                        employees.getProjects())).collect(Collectors.toSet());
        System.out.println("increasedSal : " +increasedSalSet);

        //filter
        // increased the salary who get greater than 5k
        List<Employees> inSalGT5k = employees.stream()
                .filter(employees -> employees.getSalary() > 25000)
                .map(employees -> new Employees(
                        employees.getFirstName(),
                        employees.getLastName(),
                        employees.getSalary()*1.10,
                        employees.getProjects())).toList();
        System.out.println("inSalGT5k : " + inSalGT5k);

        //filter
        // increased the salary who get greater than 5k
        // find the first employee
        Employees firstEmployee = employees.stream()
                .filter(employees -> employees.getSalary() > 25000)
                .map(employees -> new Employees(
                        employees.getFirstName(),
                        employees.getLastName(),
                        employees.getSalary()*1.10,
                        employees.getProjects()))
                .findFirst()
                .orElse(null);
        System.out.println("firstEmployee : " + firstEmployee);

        //flat map
        String projects =
                employees
                .stream()
                .map(Employees::getProjects)
                .flatMap(Collection::stream)
                .collect(Collectors.joining(","));
        System.out.println(projects);

        //Short circuit operation
        List<Employees> shortCircuitElements =
                employees
                        .stream()
                        .skip(1) // skip the first element
                        .limit(1) // limit by 1 element then rest of them automatically skipped
                        .toList();
        System.out.println(shortCircuitElements);

        //finite data
        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);

        // sorting
        List<Employees> sortedEmployees =
                employees
                        .stream()
                        .sorted((O1, O2) -> O1.getFirstName()
                                .compareToIgnoreCase(O2.getFirstName()))
                        .collect(Collectors.toList());
        System.out.println(sortedEmployees);

        // reduce
        Double totalSal =
                employees
                        .stream()
                        .map(Employees::getSalary)
                        .reduce(0.0, Double::sum);
        System.out.println(totalSal);

        // min or max
        System.out.println(employees
                .stream()
                .max(Comparator.comparing(Employees::getSalary))
                .orElseThrow(NoSuchElementException::new));


    }
}
