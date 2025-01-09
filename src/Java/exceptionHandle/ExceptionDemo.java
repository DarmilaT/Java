package Java.exceptionHandle;

import java.util.*;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        try{
//            if(str.equals("Yellow"))
//                throw new MyException("Yellow");
//        } catch (MyException e){
//            System.out.println(e.getMessage());
//        }
        String str = "Yellow";
        assert !str.equals("Yellow") : new MyException("error");

//        String a = "Writing a story";
//        //System.out.print(a.charAt(16));
//
//        List list = new ArrayList();
//        list.add("one");
//        Iterator it = list.iterator();
//        while (it.hasNext()){
//            Integer i = (Integer) it.next();
//        }


    }
}
