public class Main {

//    While = it will execute as long as condition is true
//    Do - while = do will the codeblock once, and then if while is satisfied, it will execute as long as condition in while is true
//    continue keyword - the loop will bypass the part of code block that is below the continue keyword and continue with next loop iteration
//    break - exits / ends the loop

    public static void main(String[] args) {
        System.out.println("Hello world!");
        int count = 0;
        while (count != 5) {
            System.out.println("Count value is "+ count);
            count++;
        }

        count = 6;
        do {
            System.out.println("Count value was " + count);
            count++;

            if(count > 100) {
                break;
            }
        } while (count != 6);

        int number = 4;
        int evenCount = 0;

        while (number <= 20) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            evenCount++;
            if(evenCount == 5) {
             System.out.println("# of Even Numbers: " + evenCount);
             break;
            }
        }
    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}