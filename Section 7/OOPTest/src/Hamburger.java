public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadType;
    private String additionName;
    private double additionPrice;
    private String additionNameTwo;
    private double additionPriceTwo;
    private String additionNameThree;
    private double additionPriceThree;
    private String additionNameFour;
    private double additionPriceFour;

    public Hamburger(String name, String meat, double price, String breadType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadType = breadType;
    }

    public void addHamburgerAdditionOne(String name, double price) {
        this.additionName = name;
        this.additionPrice = price;
    }

    public void addHamburgerAdditionTwo(String name, double price) {
        this.additionNameTwo = name;
        this.additionPriceTwo = price;
    }

    public void addHamburgerAdditionThree(String name, double price) {
        this.additionNameThree = name;
        this.additionPriceThree = price;
    }

    public void addHamburgerAdditionFour(String name, double price) {
        this.additionNameFour = name;
        this.additionPriceFour = price;
    }

    public double itemizedHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger on a " + this.breadType + " roll and price is " + this.price);
        if(this.additionName != null) {
            hamburgerPrice+=this.additionPrice;
            System.out.println("Added " + this.additionName + " for an extra " + this.additionPrice);
        }
        if(this.additionNameTwo != null) {
            hamburgerPrice+=this.additionPriceTwo;
            System.out.println("Added " + this.additionNameTwo + " for an extra " + this.additionPriceTwo);
        }
        if(this.additionNameThree != null) {
            hamburgerPrice+=this.additionPriceThree;
            System.out.println("Added " + this.additionNameThree + " for an extra " + this.additionPriceThree);
        }
        if(this.additionNameFour != null) {
            hamburgerPrice+=this.additionPriceFour;
            System.out.println("Added " + this.additionNameFour + " for an extra " + this.additionPriceFour);
        }

        return hamburgerPrice;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public String getBreadType() {
        return breadType;
    }
}
