import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("12345 6789");
    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while(!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0: {
                    System.out.println("\n Shutting down...");
                    quit = true;
                    break;
                }
                case 1: {
                    mobilePhone.printContacts();
                    break;
                }
                case 2: {
                    addNewContact();
                    break;
                }
                case 3: {
                    updateContact();
                    break;
                }
                case 4: {
                    removeContact();
                    break;
                }
                case 5: {
                    queryContact();
                    break;
                }
                case 6: {
                    printActions();
                    break;
                }
            }
        }
    }

    private static void startPhone() {
        System.out.println("Starting phone....");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:");
        System.out.println("0 - Shutdown");
        System.out.println("1 - Print contacts");
        System.out.println("2 - Add new contact");
        System.out.println("3 - Update existing contact");
        System.out.println("4 - Remove an existing contact");
        System.out.println("5 - Query if contact exist");
        System.out.println("6 - Print all actions");
        System.out.print("Choose action: ");
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number");
        String phoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phoneNumber);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: " + name + ", phone = " + phoneNumber);
        } else {
            System.out.println("Contact already exist");
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if(existingContact == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if(mobilePhone.updateContact(existingContact, newContact)) {
            System.out.println("Successfully updated record");
        } else {
            System.out.println("Error updating record");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found");
            return;
        }
        if(mobilePhone.removeContact(existingContact)) {
            System.out.println("Successfully removed contact");
        } else {
            System.out.println("Error removing contact");
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: " + existingContact.getName() + " phone number is " + existingContact.getPhoneNumber() );
    }
}