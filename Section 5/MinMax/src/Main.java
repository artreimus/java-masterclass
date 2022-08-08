import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      Alternative solution: (remove the boolean flag if you're going to use this)
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
        int min = 0;
        int max = 0;
        boolean firstInput = true;

        while(true) {
            System.out.print("Enter Number: ");
            boolean isInteger = scanner.hasNextInt();
            if (isInteger) {
                int number = scanner.nextInt();
                if(firstInput) {
                    min = number;
                    max = number;
                    firstInput = !firstInput;
                }
                if(number > max) max = number;
                if(number < min) min = number;
            } else {
                System.out.println("Invalid number");
                break;
            }
            scanner.nextLine();
        }
        System.out.println("The min value is " + min + " while the max value is " + max);
        scanner.close();
    }
}