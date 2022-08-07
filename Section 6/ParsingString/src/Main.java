public class Main {

//    To parse an int use a Wrapper class and its parse method

//    Integer is a wrapper class
//    It contains a parseInt method that converts the input to an integer
//    Adding int to a string only appends the number
//    Adding int to an int adds the two integers

    public static void main(String[] args) {
        String numberAsString = "2018";
        String doubleAsString = "2018.123";
        System.out.println("Number as string = " + numberAsString);
        System.out.println("Decimal as string = " + doubleAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("Number as int = " +  number);

        double decimal = Double.parseDouble(doubleAsString);
        System.out.println("Number as double = " +  decimal);

        number += 1;
        decimal += 10.3d;
        numberAsString += 1;
        System.out.println("Number as string = " + numberAsString);
        System.out.println("Number as int = " +  number);
        System.out.println("Number as double = " +  decimal);




    }
}