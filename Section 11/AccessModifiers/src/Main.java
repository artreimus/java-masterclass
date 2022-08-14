public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Account artAccount = new Account("art");
        artAccount.deposit(1000);
        artAccount.withdraw(500);
        artAccount.withdraw(-200);
        artAccount.deposit(-20);
        artAccount.calculateBalance();
        artAccount.balance = 5000; // Can change because balance was set to public!
        System.out.println("Balance on account is " + artAccount.getBalance());
        artAccount.transactions.add(4500); // Can change because transactions is set to public!
        artAccount.calculateBalance();

    }
}