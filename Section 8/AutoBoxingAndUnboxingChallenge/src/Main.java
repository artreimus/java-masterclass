public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("National Philippines Bank");
        bank.addBranch("Manila");
        bank.addCustomer("Manila", "Rei", 50.05d);
        bank.addCustomer("Manila", "Art", 310.05d);
        bank.addCustomer("Manila", "Reimus", 10.33d);
        bank.addBranch("Tarlac");
        bank.addCustomer("Tarlac", "Bob", 100.15d);
        bank.addCustomerTransaction("Manila", "Rei", 44.23d);
        bank.addCustomerTransaction("Manila", "Rei", 22.23d);
        bank.addCustomerTransaction("Manila", "Rei", 33.13d);
        bank.listCustomers("Manila", true);
        bank.listCustomers("Tarlac", true);

        bank.addBranch("Melbourne");
        if(!bank.addCustomer("Melbourne", "Brian", 5.53d)) {
            System.out.println("Branch does not exist");
        } else {
            System.out.println("Added to melbourne branch");
        }

        if(!bank.addBranch("Melbourne")) {
            System.out.println("Branch already exist");
        }

        if(!bank.addCustomerTransaction("Melbourne", "Lebron", 5.53d)) {
            System.out.println("Customer does not exist");
        }

        if(!bank.addCustomer("Manila", "Art", 12.30d)) {
            System.out.println("Customer already exist");
        }
    }
}