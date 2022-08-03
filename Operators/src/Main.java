public class Main {
//    + addition
//    - subtraction
//    * multiplication
//    / division
//    '=" equals
//    % modulus (gets the remainder)
//    ++ increment
//    -- decrement
//    += shortcut for variable = variable + value;
//    -= shortcut for variable = variable - value;
//    *= shortcut for variable = variable * value;
//    /= shortcut for variable = variable / value;
//    ! negation
//    == is equals
//    != not equals
//    < less than
//    <= less than or equal
//    > greater than
//    >= greater than or equal
//    & bitwise AND (works for BITS)
//    && AND
//    | bitwise OR (works for BITS)
//    || OR
//    :( sad hehe
//    d f l
    public static void main(String[] args) {
//        + is the operator
//        10 and 15 are operands
//        10 + 15 is an expression
        int sampleInt = 10 + 15;
        int result = 1 + 2;
        boolean testBoolean = result == 3;
        System.out.println(testBoolean);
        int modulus = result % 2;
        System.out.println(modulus);

        boolean isAlien = false;
        if (isAlien) {
            System.out.println("It is an alien");
            System.out.println("It is an alien!");
            System.out.println("It is an alien!!");
        } else if (!isAlien)
            System.out.println("It is not an alien");
        int topScore = 99;

        if (topScore == 100 | true) {
            System.out.println("You got the highest score! :)");
        } else if (topScore < 100) {
            System.out.println("Sorry, you did not get the highest score");
        }


        double myDouble = 20.00d;
        double mySecondDouble = 80.00d;
        double myThirdDouble = (myDouble + mySecondDouble) * 100.00;
        double remainder = myThirdDouble % 40.00;
        boolean myBoolean = remainder == 0 ? true : false;
        System.out.println(myBoolean);

        if (!myBoolean) {
            System.out.println("Got some remainder");
        } else {
            System.out.println("No remainders here");
        }
    }
}