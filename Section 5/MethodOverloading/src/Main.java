public class Main {
//    Method overloading is using the same name for a method but with different parameters (data types, parameters used)
//    Even if the return type is unique, it is still going to overload the method

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore("hello", 75);
        calculateScore();
        double calculatedCentimeters = calcFeetAndInchesToCentimeters(-1, 0);
        System.out.println(calculatedCentimeters);
        double anotherCalculatedCentimeters = calcFeetAndInchesToCentimeters(100);
        System.out.println(anotherCalculatedCentimeters);
    }
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }
    public static void calculateScore() {
        System.out.println("No player name, no player score");
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if(feet < 0 || (inches < 0 || inches > 12)) {
            return -1;
        }
        double feetToCentimeters = feet * 30.48d;
        double inchesToCentimeters = inches * 2.54d;
        System.out.println("Feet: " + feetToCentimeters + " Inches: " + inchesToCentimeters);
        return feetToCentimeters + inchesToCentimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

}
