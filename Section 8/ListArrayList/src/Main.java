import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstruction();
        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case  5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
                default:
                    quit = true;
                    break;
            }
        }
    }
    private static void printInstruction() {
        System.out.println("\n Press");
        System.out.println("\t 0- To print choice options");
        System.out.println("\t 1- To print the list of grocery items");
        System.out.println("\t 2- To add an item to the list");
        System.out.println("\t 3- To modify an item in the list");
        System.out.println("\t 4- To remove an item from the list");
        System.out.println("\t 5- To search for an item in the list");
        System.out.println("\t 6- To process array");
        System.out.println("\t 7- To quit the application");
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter the item name: ");
        String oldItem = scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem( oldItem, newItem);
    }
    public static void removeItem() {
        System.out.print("Enter the item name: ");
        String item = scanner.nextLine();
        groceryList.removeGroceryItem(item);
    }

    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in your grocery list");
        } else {
            System.out.println("Item " + searchItem + " not found");
        }
    }

    public static void processArrayList() {
//        Copying arrays
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());
        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());
        System.out.println(groceryList.getGroceryList());
//        Array list to regular array
        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }
}