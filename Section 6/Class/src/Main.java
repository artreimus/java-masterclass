public class Main {
//    Objects -
//    State -
//    Behavior -
//    Class - template / blueprint for objects
//    First letter of a class must be capitalized
//    Object can be created through the use of classes as its blueprints
//    fields = local variables with access modifier. fields must always be private.
//    Setters = sets the field
//    Getters = gets the field
//    null = default value of variables if not initialized

    public static void main(String[] args) {
//        Objects
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("carrera");
        holden.setModel("jeep");
        System.out.println(porsche.getModel());
        System.out.println(holden.getModel());

    }
}