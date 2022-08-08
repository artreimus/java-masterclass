public class Main {

//    steps for using switch statement:
//    declare the variable to be monitored
//    declare the case condition
//    type what happens when the case is true
//    add break statement
//    add default value. it will execute when all cases are false

//    switch statement can support multiple cases in one line!
//    always add break value!
//    it is possible to not invoke break in the default statement (because it is the last statement) but it is -
//    frowned upon


    public static void main(String[] args) {
        int switchValue = 3;

        switch(switchValue) {

            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was 3 or 4 or 5!");
                System.out.println("Actually is was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2!");
                break;
        }

        char characterValue = 'D';

        switch(characterValue) {
            case 'A':
                System.out.println("Value was A");
                break;
            case 'B':
                System.out.println("Value was B");
                break;
            case 'C':
                System.out.println("Value was C");
                break;
            case 'D': case 'E':
                System.out.println("Value was " + characterValue);
                break;
            default:
                System.out.println("Character not found, sorry!");
                break;
        }
    }
}
