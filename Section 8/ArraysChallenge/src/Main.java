import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] integerArray = setIntegers(5);
        printArray(sortArray(integerArray));
    }

    public static int[] setIntegers(int length) {
        int[] array = new int[length];
        System.out.println("Enter " + length + " integer values:\r");
        for(int i=0; i<array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i<array.length; i++) {
            System.out.println("Element " + i + " content is " + array[i]);
        }
    }

    public static int[] sortArray(int[] array) {
//        Manual way of copying an array
//        int[] sortedArray = new int[array.length];
//        for(int i = 0; i < sortedArray.length; i++) {
//            sortedArray[i] = array[i];
//        }
//        Built in method for copying an array
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i =0; i < sortedArray.length - 1; i++) {
                if(sortedArray[i] > sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}