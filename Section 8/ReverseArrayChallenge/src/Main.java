import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Array = " + Arrays.toString(intArray));
        reverse(intArray);
        System.out.println("Reversed array = " + Arrays.toString(intArray));
    }

    private static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        for(int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}