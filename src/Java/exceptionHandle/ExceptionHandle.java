package Java.exceptionHandle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.*;

public class ExceptionHandle {
    // declaring the type of exception
    public static void findFile() throws FileNotFoundException {

        // code that may generate IOException
        File newFile = new File("test.txt");
        FileInputStream stream = new FileInputStream(newFile);
    }
    public static void main(String[] args) throws InsufficientException {
        int a=9, b = 1;
        //int c = a/b; //Exception in thread "main" java.lang.ArithmeticException: / by zero
                     //at oop.ExceptionHandle.main(ExceptionHandle.java:6)
        // this code is not executed here
        // so, we want to handle it
        int c = 0;
        //un checked exception - runtime
        try {
            //Code that may cause an exception
            //int n = Integer.parseInt("GGGG"); // NumberFormatException
            //try this code
            c= a/b; //arithmeticException // throw
            int arr[] = null;
            System.out.println(arr[1]);
            return; // the "finally" block still execute here
        }
        catch(ArithmeticException | NullPointerException e){    // java 1.7
            //Code that we want to execute if this type of exception
            //if any error comes execute following
            System.out.println("Exception has Occurred => " + e.getMessage());
            // to print error message
            System.err.println("Error Occurred"); // output will come in red color
        }
        catch (NumberFormatException nfe){
            System.err.println("NumberFormatException has Occurred");
        }
        catch (Exception e){
            System.err.println("Exception");
        }
        finally {
            //always execute
            System.out.println("This must be print");
        }
        System.out.println(c);

        //checked exception - compile time
//        File f = new File("f.txt");
//        try{
//            FileInputStream fs = new FileInputStream(f);
//        }
//        catch (FileNotFoundException e){
//            //print why this error occur
//            //e.printStackTrace();
//        }

        //we want to close the resource after use
//        Scanner input = new Scanner(System.in);
//        int in = input.nextInt();
//        input.close();
        // instead of this
        //try with resource - this will automatically close
//        try (Scanner s = new Scanner(System.in)){
//            in = s.nextInt();
//        }

//        //custom exception
//        double bal = 500, withdraw = 700;
//        try{
//            if(bal<withdraw){
//                throw new InsufficientException(withdraw-bal); //create new object
//            }
//        }
//        catch(InsufficientException e){
//            System.out.println("Not Enough money");
//        }

        try {
            findFile();
        }
        catch (IOException e ) {
            System.out.println(e);
        }

        
    }
}
