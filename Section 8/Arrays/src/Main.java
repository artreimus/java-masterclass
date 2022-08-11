import java.util.Scanner;

public class Main {
//    Arrays in Java can only store elements that have the same data types
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        Initialize method one
        int[] intArray = new int[10]; //How many elements you want to store
        intArray[1] = 30; // Save 30 in index 1
        intArray[5] = 50; // Save 50 in index 5
        System.out.println(intArray[5]);
//        Initialize method two
        int[] intArrayTwo = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for(int i = 0; i < intArrayTwo.length; i++) {
            System.out.println(intArrayTwo[i]);
        }
//        Initialized method three
        int[] intArrayThree = new int[10];
        for(int i = 0; i < intArrayThree.length; i++) {
            intArrayThree[i] = i * 10;
        }
        printArray(intArrayThree);
        double[] doubleArray = new double[10];
        doubleArray[0] = 1.33d;


        int[] myIntegers = getIntegers(5); // Allows us to type in 5 integers
        for(int i =0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed values was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));

    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number +  " integer values.\r");
        int[] values = new int[number];

        for(int i=0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum / array.length;
        return average;
    }
}