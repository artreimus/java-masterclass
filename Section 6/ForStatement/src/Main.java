public class Main {

//    For loop - repeats the code block until the particular condition is satisfied
//    Syntax : for (init; termination; increment)

    public static void main(String[] args) {
        System.out.println(calculateInterest(10000.0d, 2.0d));
//        System.out.println(calculateInterest(10000.0d, 3.0d));
//        System.out.println(calculateInterest(10000.0d, 4.0d));
//        System.out.println(calculateInterest(10000.0d, 5.0d));

        for (int i = 2; i <= 8; i++) {
            System.out.println(String.format("%.3f", calculateInterest(10000.0d, i)));
        }

        for (int i = 8; i >= 2; i--) {
            System.out.println(String.format("%.3f", calculateInterest(10000.0d, i)));
        }

        int primeCount = 0;
        for (int i = 20; i <= 50; i++) {
            if (isPrime(i)) {
                primeCount+=1;
                System.out.println(i + " is a prime number");
            }
            if (primeCount == 10) break;
        }
    }

    public static double calculateInterest (double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime (int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
