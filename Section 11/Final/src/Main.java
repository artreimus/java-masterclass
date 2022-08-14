public class Main {
//    Final are used to assign constant values.
//    We can only assign values to final once, and the assignment can possibly not happen during initialization.
    public static void main(String[] args) {
        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");
        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

        System.out.println(Math.PI);
//        Math m = new Math(); // Can't instantiate because Math constructor was set to private!

        int pw = 1234123123;
        Password strongPassword = new ExtendedPassword(pw);
        strongPassword.storePassword();
        strongPassword.letMeIn(1);
        strongPassword.letMeIn(9132131);
        strongPassword.letMeIn(3213231);
        strongPassword.letMeIn(pw);

        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);

    }
}