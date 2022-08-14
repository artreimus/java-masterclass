public class SIBTest {
    public static final String owner;

    static {
        owner = "tim";
        System.out.println("SIBTest static initialization block called");
    }

    public SIBTest() {
        System.out.println("SIB constructor called");
    }


//    We can use as many static initialization block as we want
//    Static initialization blocks are called b4 the initialization constructor!
    static {
        System.out.println("2nd initialization  block called");
    }

    public void someMethod() {
        System.out.println("someMethod called");
    }
}
