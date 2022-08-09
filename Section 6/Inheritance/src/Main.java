public class Main {
//    Different kinds of objects have a lot of attributes in common with each other.
//    But they have feature that differentiate them from each other.
//    Objects allow inheritance to pass attributes/fields & methods.
//    Use extends to inherit from a parent (e.g: Dog extends Animal)
//    Super - Calls the constructor from the parent class and initializes the fields.

    public static void main(String[] args) {
        Animal animal = new Animal("Bruno", 1, 1, 5, 5);
        Dog dog = new Dog("Cotton", 8, 20, 2, 4, 1, 20, "silky");
//        dog.eat();
        dog.walk();
        dog.run();
        Poodle poodle = new Poodle("Cosmo", 8, 20, 2, 4, 1, 20, "silky");
        System.out.println(poodle.getBrain());

    }
}