// Abstraction defines what needs to be done, instead of how it is done
// Abstract = allows inheritance
// Inheritance =
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breath();
        dog.eat();

        Parrot parrot = new Parrot("Parrot");
        parrot.breath();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Penguin");
        penguin.fly();


    }
}