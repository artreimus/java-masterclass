import java.util.ArrayList;

class IntClass {
    private int myValue;
    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {



    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Tim");
//        ArrayList<int> intArrayList = new ArrayList<int>(); // This is not allowed, it won't work!
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));
//        Boxing:
//        Integer integer = new Integer(54);
//        Double double = new Double(12.52d);

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for(int i = 0; i <= 10; i++) {
            integerArrayList.add(Integer.valueOf(i)); //Auto boxing - converting int to Integer
        }

        for(int i = 0; i<= 10; i++) {
            System.out.println(i + " ---> " + integerArrayList.get(i).intValue()); // Converting Integer to int
        }

//        Java compiler automatically converts Integer and int... (and also other data types :) )
        Integer myIntValue = 56; // Integer.valueOf(56);
        int myInt = myIntValue; // myIntValue.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0.0; dbl <= 10.0; dbl+= 0.5) {
//            myDoubleValues.add(Double.valueOf(dbl));
            myDoubleValues.add((dbl)); // Autoboxing
        }

        for (int i=0; i<myDoubleValues.size(); i++) {
//            double value = myDoubleValues.get(i).doubleValue();
            double value = myDoubleValues.get(i); // Autoboxing
            System.out.println(i + " ---> " + value);
        }

    }

}