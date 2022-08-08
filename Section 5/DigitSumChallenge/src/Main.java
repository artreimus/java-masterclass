public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigit(125));
        System.out.println(sumDigit(-1));
        System.out.println(sumDigit(0));
        System.out.println(sumDigit(1000));
    }

    private static int sumDigit(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;
        int tempNumber = number;

        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            sum+=digit;
            tempNumber /= 10;
        }

        return sum;
    }
}