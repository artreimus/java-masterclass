import static org.junit.Assert.*;

public class BankAccountTest {

    private static int count;

    private BankAccount account;
    @org.junit.Before
    public void setup() {
        account = new BankAccount("Arthur", "Reimus", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test");
    }


    @org.junit.BeforeClass
    public static void beforeClass() {
        System.out.println("This executes before any test cases. Count = " + count++);
    }

    @org.junit.Test
    public void deposit() throws Exception  {
        double balance = account.deposit(600.00, true);
        assertEquals(1600.00, balance, 0); // delta = allows leeway in the decimal value of Doubles
    }

    @org.junit.Test
    public void withdraw_branch() throws Exception {
        double balance = account.withdraw(600.00, true);
        assertEquals(400.00, balance, 0);
    }

    @org.junit.Test(expected = IllegalArgumentException.class) // expects a throw exception
    public void withdraw_notBranch() throws Exception {
        account.withdraw(600.00, false);
//        assertEquals(400.00, balance, 0); // we can remove the assert for this test because -
        // we are only testing for the throw exception
    }


    // old way of testing exceptions
//    @org.junit.Test // (expected = IllegalArgumentException.class) // expects a throw exception
//    public void withdraw_notBranch() throws Exception {
//        try{
//            account.withdraw(600.00, true);
//            fail("Should have thrown an IllegalArgumentException");
//        } catch(IllegalArgumentException e) {
//
//        }
////        assertEquals(400.00, balance, 0); // we can remove the assert for this test because -
//        // we are only testing for the throw exception
//    }


    @org.junit.Test
    public void getBalance_deposit() throws Exception  {
        account.deposit(200.00, true);
        assertEquals(1200.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalance_withdraw() throws Exception  {
        account.withdraw(200.00, true);
        assertEquals(800.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void isChecking_true() throws Exception  {
        assertTrue("The account is NOT a checking account", account.isChecking());
    }

    @org.junit.AfterClass
    public static void afterClass() {
        System.out.println("This execute after all test cases. Count = " + count++);
    }

    @org.junit.After
    public void teardown() {
        System.out.println("Count = " + count++);
    }
}