public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Sausage and Bacon", 12.69d, "White bread");
        super.addHamburgerAdditionOne("Chips", 2.75d);
        super.addHamburgerAdditionTwo("Coke", 1.73d);
    }

    @Override
    public void addHamburgerAdditionOne(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger :(");
    }

    @Override
    public void addHamburgerAdditionTwo(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger :(");
    }

    @Override
    public void addHamburgerAdditionThree(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger :(");
    }

    @Override
    public void addHamburgerAdditionFour(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger :(");
    }
}
