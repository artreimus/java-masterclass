import java.util.Scanner;

public class Main {

//    Local class - declared inside Class
//    Anonymous class - a local class with no name

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");
    public static void main(String[] args) {
        Gearbox mcLaren = new Gearbox(6);
//        It is not recommended to set inner gear as public: (example below uses a Gear class that is public)
//        Gearbox.Gear first = mcLaren.new Gear(1, 12.3); // Proper way of invoking an inner class
//        Gearbox.Gear second = new Gearbox.Gear(2, 15.4); WONT WORK! this is not allowed
//        Gearbox.Gear third = new Gearbox.Gear(3, 17.8); WONT WORK TOO! this is not allowed
//        System.out.println(first.driveSpeed(1000));
//        Inner class should be private and used like this:
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(1);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(1000));
//        mcLaren.changeGear(2);
//        System.out.println(mcLaren.wheelSpeed(3000));
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(3);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(6000));

//        This is a local class
        class ClickListener implements Button.OnClickListener {
            public ClickListener() {
                System.out.println("I've been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }

        btnPrint.setOnClickListener(new ClickListener());

//        This is an anonymous function
        btnPrint.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });

        listen();
    }

    private static void listen() {
        boolean quit = false;
        while(!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }


}