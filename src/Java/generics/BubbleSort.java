package Java.generics;

public class BubbleSort<E> {
    public <E extends Comparable<E>> BubbleSort(E[] array){
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1].compareTo(array[i]) > 0) {
                    // Swap array[i-1] and array[i]
                    swap(i - 1, i,array);
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }

    public static void swap(int i, int j, Object[] arr){
        Object temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(Object[] arr){
        for (Object ob : arr){
            System.out.println(ob);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {34,6,5,89,52};
        Double[] doubleArray = {5.7,5.5,6.3,9.2};
        new BubbleSort(intArray);
        new BubbleSort(doubleArray);
        print(intArray);
        print(doubleArray);

    }
}
