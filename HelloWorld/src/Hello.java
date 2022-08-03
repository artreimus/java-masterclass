public class Hello {
//    Public is the access modifier
//    We need static for java methods
//    Void is used to indicate that the method will not return anything
//    { } - code block
//    Variable can be declared through:
//    Declaration x Assignment x Initialization
//    Declaration - only declaring the type and name of a variable
//    Assignment - assigning a value to a variable
//    Initialization - declaring the type, name, and value of a variable

    public static void main(String[] args) {
        String name = "Tim";
        System.out.println("Hello, " + name);
        int myFirstNumber = (5+10) + (5*10);
        int mySecondNumber = 12;
        int mythirdNumber =  13;
        int myTotal = (myFirstNumber+ mythirdNumber+ mySecondNumber);
        System.out.println(myTotal);
    }
}
