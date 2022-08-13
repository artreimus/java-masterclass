import java.util.ArrayList;


//Generics is the type declared between < > when declaring List
//We can use diamonds "<>" in generic assignment for Java 7 above

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        printDouble(items);
    }

    private static void printDouble(ArrayList<Integer> n) {
        for (int i : n) { // Auto boxing (converts Integer to int automatically)
            System.out.println( i * 2);
        }
    }

}