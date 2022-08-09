public class Account {

    public Account() {
        this(123, 0.00d, "Default", "john@email.com", "12345678");
        System.out.println("Empty constructor");
    }

    public Account(long accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Constructor with parameters :)");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    private long accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    private void setBalance(double funds, String mode) {
        if (mode.toLowerCase() == "deposit") {
            this.balance+= funds;
        } else if (mode.toLowerCase() == "withdraw") {
            this.balance-= funds;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void depositFunds(double funds) {
        String mode = "deposit";
        if (funds > 0) {
            setBalance(funds, mode);
        } else {
            System.out.println("Invalid input. Can't deposit");
        }
    }

    public void withdrawFunds(double funds) {
        String mode = "withdraw";
        if (funds <= this.balance) {
            setBalance(funds, mode);
        } else {
            System.out.println("Not enough balance. You only have " + this.balance + " in your account :(");
        }
    }
}
