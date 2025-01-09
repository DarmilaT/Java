package Java.memoryManagement;

public class Main {
    public static void main(String[] args) {
        int value = 7;
        value = calculate(value);
    }

    private static int calculate(int value) {
        int temp = value + 1;
        return temp * 2;
    }
}
