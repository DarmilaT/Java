package Java.assertions;

public class Test{
    public static void main(String[] args) {
        int age = 20;
        assert age > 20 : getMessage();
        System.out.println("Valid");
    }
    public static int getMessage() {
        System.out.println("Not valid");
        return 2;
    }
}

