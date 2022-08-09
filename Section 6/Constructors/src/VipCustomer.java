public class VipCustomer {
    private String customerName;
    private String customerEmail;
    private double creditLimit;

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public VipCustomer() {
        this("Default Name", "default@email.com", 0.00d);
        System.out.println("Empty VIP Customer Constructor");
    }

    public VipCustomer(String customerName, String customerEmail) {
        this(customerName, customerEmail, 0.00d);
    }

    public VipCustomer(String customerName, String customerEmail, double creditLimit) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.creditLimit = creditLimit;
        System.out.println("Populated VIP Customer Constructor");
    }

}
