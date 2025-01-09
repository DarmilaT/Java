package Java.exceptionHandle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class SampleException {
    public static void InvalidInput(int num) throws InvalidInputException{
        if(num > 100){
            throw new InvalidInputException("Exception");
        }
        System.out.println("Valid Input");
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number less than 100 : ");
//        int number = input.nextInt();

//        try{
//            InvalidInput(number);
//        }
//        catch(InvalidInputException e){
//            System.out.println("You entered number greater than 100");
//            System.out.println(e.getMessage());
//        }

        System.out.println("Enter the Date \"yyy/mm/dd\" : ");
        String date = input.nextLine();
        ConvertDate(date);
    }
    public static void ConvertDate(String inDate){
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("yyy/mm/dd");
            Date date = sdf.parse(inDate);
            SimpleDateFormat outFormat = new SimpleDateFormat("dd-mm-yyyy");
            String convertDate = outFormat.format(date);
            System.out.println("Date : " + convertDate);
        }
        catch (ParseException e){
            System.out.println(e.getMessage());
        }
        HashSet<String> m = new HashSet<>();
        Iterator<String> itr = m.iterator();
    }
}



