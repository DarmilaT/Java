package Java.assertions;

import java.util.Scanner;

public class DivisionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();

        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();

        try {
            assert b != 0 : "Division by zero is not allowed";
            int result =  a / b;
            System.out.println("a / b = " + result);
        } catch (AssertionError e) {
            System.err.println("Assertion Error: " + e.getMessage());
        }

        scanner.close();
    }
}

