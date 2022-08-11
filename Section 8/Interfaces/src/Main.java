public class Main {
//    Interfaces = specifies methods that a particular class that implements the interface must implement
//    Interfaces provide common behavior between classes

    public static void main(String[] args) {
        ITelephone myPhone = new DeskPhone(123456);
        myPhone.powerOn();
        myPhone.callPhone(123456);
        myPhone.answer();

        myPhone = new MobilePhone(923456); // We can change it to a different class too!
//        This is because it is an instance instead of a class ;)

        ITelephone myMobilePhone = new MobilePhone(234567);
//        myMobilePhone.powerOn();
        myMobilePhone.callPhone(234567);
        myMobilePhone.answer();
    }
}