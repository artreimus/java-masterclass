public class Main {

//    Overloading = providing two or more separate methods in a class with same name but diferent parameters
//    Overloading is also known as Compile Time Polymorphism
//    Overriding = means defining a method in a child class that already exist in the parent class with the SAME name and SAME arguments
//    Use @Override to override a parent class method
//    Only inherited methods can be overriden
//    Constructor and private methods can't be overriden
//    We can use super.methodName() to use the overeride the method still.


    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.bark();
        dog.bark(3);
        GermanSheperd germanSheperd = new GermanSheperd();
        germanSheperd.bark();
        germanSheperd.bark(3);
    }
}