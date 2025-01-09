package Java.regex;
import java.util.regex.*;
public class email {
    public static boolean isValidEmail(String email) {
        String regexEmail = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern p = Pattern.compile(regexEmail);
        Matcher m = p.matcher(email);
        return m.matches();
    }

    public static void main(String[] args) {

        //System.out.println(isValidEmail("darmi@gmail.com"));
        //System.out.println(Pattern.matches("[a-zA-Z]", "G"));

//        Pattern p = Pattern.compile("25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]?|0");
//        Matcher m = p.matcher("9");
//        System.out.println( m.matches());

//        Pattern p = Pattern.compile("[a-fA-F]{1,4}");
//        Matcher m = p.matcher("dbf");
//        System.out.println( m.matches());

        String input = "apple,banana,orange";
        String[] parts = input.split(",", -1);
        System.out.println(parts.length);
    }

}
