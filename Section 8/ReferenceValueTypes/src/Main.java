import java.util.Arrays;

public class Main {

//    Reference types points to a memory address
//    Array and strings are reference types
//    boolean, double, int, char, float are value types
    public static void main(String[] args) {

//        Value Types
        int intValueOne = 10;
        int intValueTwo = intValueOne;
        System.out.println(intValueOne + ", " + intValueTwo);
        intValueTwo++;
        System.out.println(intValueOne + ", " + intValueTwo);

//        Reference types
        String stringValue = "Hello World!";
        String stringValueTwo = stringValue;
        System.out.println(stringValue + ", " + stringValueTwo);
        stringValueTwo = "Hi World!";
        System.out.println(stringValue + ", " + stringValueTwo);

        int[] intArray = new int[5];
        int[] intArrayTwo = intArray;
        System.out.println(Arrays.toString(intArray) + ", " + Arrays.toString(intArrayTwo));
        intArrayTwo[3] = 10;
        System.out.println(Arrays.toString(intArray) + ", " + Arrays.toString(intArrayTwo));
        modifyArray(intArray);
        intArrayTwo = new int[] {4, 5, 6, 7, 8};
        intArrayTwo[3] = 1;
        System.out.println(Arrays.toString(intArray) + ", " + Arrays.toString(intArrayTwo));
    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[] {1, 2, 3, 4, 5};
    }
}