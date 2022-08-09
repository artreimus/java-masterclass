public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;



    //    Removed brain and body parameters because dogs only have 1 body and brain!
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.move()!");
        super.move(100);
    }

    public void run () {
        System.out.println("Dog.run()!");
        move(300);
    }

    private void moveLegs(double speed) {
        System.out.println("Dog.moveLegs");
    }

    @Override
    public void move (double speed) {
        System.out.println("Dog.move() 2");
        moveLegs(speed);
        super.move(speed);
    }

//    @Override
//    public void move(double speed) {
//        super.move(speed);
//    }
}
