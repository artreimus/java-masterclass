public class Main {
//

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 4.00d, "White");
        double price = hamburger.itemizedHamburger();
        hamburger.addHamburgerAdditionOne("Tomato", 0.3d);
        hamburger.addHamburgerAdditionTwo("Lettuce", 0.75d);
        hamburger.addHamburgerAdditionThree("Cheese", 1.00d);
        price = hamburger.itemizedHamburger();
        System.out.println("Total burger price is " + price);

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 6.92d);
        healthyBurger.itemizedHamburger();
        healthyBurger.addHamburgerAdditionOne("Egg", 2.23d);
        healthyBurger.addHealthAdditionOne("Lentils", 3.43d);
        System.out.println("Total healthy burger price is " + healthyBurger.itemizedHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemizedHamburger();
        deluxeBurger.addHamburgerAdditionFour("Cheese", 1.34d);
    }
}