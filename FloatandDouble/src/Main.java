public class Main {
//    Floating number are decimal numbers
//    Can be float or double
//    Float is single precision and double is double precision
//    Single precision - 32bits / 4 bytes
//    Double precision - 64bits / 8 bytes
//    Double is more precise than float
//    Double are executed faster vs float
    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Hello world!");
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3;
        float mySecondFloatValue = (float) 5.52;
        double myDoubleValue = 5.00 / 3;
        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);

        double pound = 200.00d;
        double kilogram = 0.45359237d;
        double convertedPound = pound * kilogram;
        System.out.println("Converted kg: " + convertedPound);

        double pi = 3.1415827d;
        double randomNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(randomNumber);

    }
}