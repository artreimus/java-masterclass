public class Dog {
    public void bark() {
        System.out.println("Woof");
    }

//    This is overloading since same name, different parameters
    public void bark(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("woof woof woof");
        }
    }
}
