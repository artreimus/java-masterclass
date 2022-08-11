import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Art", 54.93d);
        Customer customerTwo;
        customerTwo = customer;
        customerTwo.setBalance(12.18d);
        System.out.println("Balance for customer: " + customer.getName() + " is " + customer.getBalance());
        System.out.println("Balance for customer two: " + customerTwo.getName() + " is " + customerTwo.getBalance());
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

//        Adding to an Array List is Memory Extensive!

        for(int i =0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1, 2);

        for(int i =0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }



    }
}