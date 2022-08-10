public class Main {
    public static void main(String[] args) {
        Wall wallOne = new Wall("West");
        Wall wallTwo = new Wall("East");
        Wall wallThree = new Wall("North");
        Wall wallFour = new Wall("South");

        Ceiling ceiling = new Ceiling(12, 55);
        Bed bed = new Bed("Modern", 4, 3, 2, 1);
        Lamp lamp = new Lamp("Classic", false, 75);
        Bedroom bedroom = new Bedroom("Art's", wallOne, wallTwo, wallThree, wallFour, ceiling, bed, lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();
//        bedroom.
    }
}