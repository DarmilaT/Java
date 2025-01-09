package Java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamGetListOfEmployees {
    public static void main(String[] args) {
        List<Employee> employeesList = getListOfEmployees();
        // Write stream code here
        // get the name list of employees
        List<String> employeeNames =
                employeesList.stream()
                        .map(e -> e.getName())
                        .collect(Collectors.toList());
        System.out.println(employeeNames);

        // return the uppercase names
        List<String> employeeNames2 =
                employeesList.stream()
                        .map(e -> e.getName())
                        .map(s -> s.toUpperCase())
                        .collect(Collectors.toList());
        System.out.println(employeeNames2);

        // return the names start with A
        List<String> employeeNames3 =
                employeesList.stream()
                        .map(e -> e.getName())
                        .filter(s -> s.startsWith("A"))
                        .collect(Collectors.toList());
        System.out.println(employeeNames3);

        // return the sorted list of Employee Objects
        List<Employee> employees =
                employeesList.stream()
                        .sorted()
                        .collect(Collectors.toList());
        System.out.println(employees);

        // return the names list of the employess
        List<String> employeeNames4 = employeesList.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println(employeeNames4);

        // return the names of the employees whose age is greater than 30
        List<String> employeesList1 =
                employeesList.stream()
                        .filter(e -> e.getAge() > 30)
                        .map(Employee::getName)
                        .toList();
        System.out.println(employeesList1);

        // return the number of the employees whose age is greater than 25
        long count =
                employeesList.stream()
                        .filter(e -> e.getAge()>25)
                        .count();
        System.out.println(count + " employees with age greater than 25");

        // sort the employees list by age
        List<Integer> sortEmployees =
                employeesList.stream()
                        .map(Employee::getAge)
                        .sorted((Integer::compareTo))
                                .toList();
        System.out.println(sortEmployees);

        List<Employee> sotedList =
                employeesList.stream()
                        .sorted(Comparator.comparingInt(Employee::getAge))
                        .toList();
        sotedList.forEach(e -> System.out.println("Name : " + e.getName() +", Age : " + e.getAge()));
    }
    public static List<Employee> getListOfEmployees() {
        List<Employee> listOfEmployees = new ArrayList<>();
        Employee e1 = new Employee("Mohan",
                24,Arrays.asList("Newyork","Banglore"));
        Employee e2 = new Employee("John",
                27,Arrays.asList("Paris","London"));
        Employee e3 = new Employee("Vaibhav",
                32,Arrays.asList("Pune","Seattle"));
        Employee e4 = new Employee("Amit",
                22,Arrays.asList("Chennai","Hyderabad"));
        listOfEmployees.add(e1);
        listOfEmployees.add(e2);
        listOfEmployees.add(e3);
        listOfEmployees.add(e4);
        return listOfEmployees;
    }
}
