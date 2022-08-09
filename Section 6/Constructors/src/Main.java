public class Main {

//    Constructors can be used to initialize the fields of a class
//    use "this()" to call another constructor within a class
//    We can declare an empty constructor, and a constructor with parameters! this uses overloading
//    Use actual field values when initializing the values in the constructor! don't use the setters!
//    Don't use methods in the constructors!

    public static void main(String[] args) {
//        Account bankAccount = new Account(123, 0.00d, "Arthur", "art@email.com", "(+63)9287295730");
//        Account bankAccount = new Account();
//        bankAccount.setCustomerName("Arthur");
//        System.out.println(bankAccount.getCustomerName());
//        bankAccount.setAccountNumber(123);
//        System.out.println(bankAccount.getAccountNumber());
//        bankAccount.withdrawFunds(1000);
//        System.out.println(bankAccount.getBalance());
//        bankAccount.depositFunds(99.0d);
//        System.out.println(bankAccount.getBalance());
//        bankAccount.withdrawFunds(1000);
        VipCustomer vipCustomer = new VipCustomer();
        System.out.println(vipCustomer.getCustomerName());
        System.out.println(vipCustomer.getCustomerEmail());
        System.out.println(vipCustomer.getCreditLimit());

        VipCustomer arthur = new VipCustomer("Arthur", "arthur@email.com");
        System.out.println(arthur.getCustomerName());
        System.out.println(arthur.getCustomerEmail());
        System.out.println(arthur.getCreditLimit());

        VipCustomer reimus = new VipCustomer("Reimus", "reimus@email.com", 100000.d);
        System.out.println(reimus.getCustomerName());
        System.out.println(reimus.getCustomerEmail());
        System.out.println(reimus.getCreditLimit());
    }
}