import java.util.Scanner;

// Scanner is one of java's built in classes
// new is used to create an instance of Scanner
// System.in takes an input from the console
// It is important to close scanner after using it to save memory
// Whenever we read a number from the scanner, pressing enter closes the scanner! Thus the next inputs won't be required
// Use scanner.nextLine() after asking for a number in the scanner

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year of birth: ");
        boolean hasNextInt = scanner.hasNextInt(); // Check if the next input is an Integer

        if (hasNextInt) {
            int birthYear = scanner.nextInt();
            scanner.nextLine();
            int age = 2022 - birthYear;
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
//        Checking for negative input
            if (age >= 0 && age <= 120) {
                System.out.println("Your name is " + name + " and your year age is " + age );
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth");
        }



        scanner.close();
    }
}