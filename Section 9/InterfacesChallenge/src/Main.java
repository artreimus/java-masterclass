import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player arthur = new Player("Arthur", 10, 13);
        System.out.println(arthur);
        saveObject(arthur);
        arthur.setHitPoints(8);
        System.out.println(arthur);
        arthur.setWeapon("Mjolnir");
        saveObject(arthur);
//        loadObject(arthur);
        System.out.println(arthur);

        ISaveable werewolf = new Monster("Werewolf", 15, 13);
        System.out.println(werewolf);
        saveObject(werewolf);
        System.out.println("Strength: " + ((Monster) werewolf).getStrength()); // We need to use casting to use methods on classes that implements interface!

    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave) {
        for(int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues(); // allows use to get input
        objectToLoad.read(values);
        System.out.println("Loading...");
    }
}