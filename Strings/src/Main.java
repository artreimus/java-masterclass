public class Main {
//    String must be declared using String (notice that the first letter must be capitalized)
//    String value must be assigned using " " double quotes
//    String is actually a class
//    String is a sequence of characters :)
//    We can also use unicode in a String
//    It is enefficient to append values using + instead use StringBuffers
    public static void main(String[] args) {
        String myString = "This is a string";
        System.out.println(myString);
        myString = myString + " and this is also a string";
        System.out.println(myString);
        myString = myString + " \u00A9 2019";
        System.out.println(myString);
        String numberString = "250.04469";
        System.out.println(numberString);
        numberString = numberString + " 250.04469";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 10;
        lastString = lastString + myInt; // Converts myInt to a String automatically ;)
        System.out.println(lastString);
//        myInt = myInt + lastString; // Cannot convert string to int :(
        System.out.println(myInt);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber; // Can also convert doubles :)
        System.out.println(lastString);
    }

}