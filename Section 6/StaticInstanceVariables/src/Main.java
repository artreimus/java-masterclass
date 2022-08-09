public class Main {

//    Static variables are Declared by using the keyword static
//    Static variables are also known as static member variables
//    Every instance of the class shares the same static variables
//    If changes are made to the static variable, all other instances will also be changed!.

//    Instance variables don't use the static keyword
//    Are also known as fields / member variables
//    Instance variables belong to an instance of a class.
//    Every instance has its own value.

    public static void main(String[] args) {
        Dog cotton = new Dog("cotton");
        Dog cosmo = new Dog("cosmo");
        cotton.printName(); // Same output because name is static
        cosmo.printName();  // Same output because name is static
        Cat bruno = new Cat("bruno");
        Cat cat = new Cat("cat");
        bruno.printName(); // Different output because name is an instance var!
        cat.printName(); // Different output because name is an instance var!
    }
}