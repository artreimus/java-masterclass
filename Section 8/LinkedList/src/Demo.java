import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesVisit = new LinkedList<String>();
        addInOrder(placesVisit, "Sydney");
        addInOrder(placesVisit, "Melbourne");
        addInOrder(placesVisit, "Brisbane");
        addInOrder(placesVisit, "Perth");
        addInOrder(placesVisit, "Canberra");
        addInOrder(placesVisit, "Adelaide");
        addInOrder(placesVisit, "Darwin");
        printList(placesVisit);
        addInOrder(placesVisit, "Alice Springs");
        addInOrder(placesVisit, "Darwin");
        printList(placesVisit);

        visit(placesVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator(); // Iterator - equivalent to a for loop
//      If there is still something to output.
        while(i.hasNext()) {
            System.out.println("Now visting " + i.next());
        }
        System.out.println("=====================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while(stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity); // Returns 0 if equal
            if(comparison == 0) {
                // equal, do not add
                System.out.println(newCity + " is already included");
                return false;
            }
            else if(comparison > 0) {
                // new city should appear before this one
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                // move to the next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean isForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()) { // If list is empty
            System.out.println("No cities found");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action) {
                case 0:
                    System.out.println("Holiday (Vacation) over");
                    quit = true;
                    break;
                case 1:
                    if(!isForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        isForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now visting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        isForward = false;
                    }
                    break;
                case 2:
                    if(isForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        isForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Going back to " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        isForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }
    private static void printMenu() {
        System.out.println("Available actions: \npress");
        System.out.println("0 - Quit");
        System.out.println("1 - Go to next city");
        System.out.println("2 - Go back to prev city");
        System.out.println("3 - Print commands again");
    }
}
