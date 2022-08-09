public class Main {

//    static methods are declared using static modified
//    static methods can't access instance methods and instance variables directly
//    usually used for operations that don't required any data from an instance of the class (from this)
//    static method can't use this keywords

//    Instance methods belong to an instance of a class
//    To use an instance method, we have to instantiate the class first using the new keyword.
//    Instance methods can access instance methods and instance variables directly.
//    Instance methods can also access static methods and static variables

//

    public static void main(String[] args) {

//        Notice that they dont need to be instantiated to be called!
        Calculator.printSum(5, 5);
        printHello();

//        Notice that it had to be instantiated using the new keyword to use the instance method!
        Dog dog = new Dog();
        dog.bark();
//
    }

    public static void printHello() {
        System.out.println("Hello :)");
    }
}