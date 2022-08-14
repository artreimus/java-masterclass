package com.example._static;

public class Main {
    public static int multiplier = 7;

    public static void main(String[] args) {
//        We use firstInstance.getNumInstances and get the right result since NumInstances is set to static!
//        StaticTest firstInstance = new StaticTest("1st Instance");
//        System.out.println(firstInstance.getName() + " is instance number " + firstInstance.getNumInstances());
//        StaticTest secondInstance = new StaticTest("2nd Instance");
//        System.out.println(secondInstance.getName() + " is instance number " + firstInstance.getNumInstances());
//        StaticTest thirdInstance = new StaticTest("3rd Instance");
//        System.out.println(thirdInstance.getName() + " is instance number " + firstInstance.getNumInstances());

//        This is the correct way to use them tho...
//        StaticTest firstInstance = new StaticTest("1st Instance");
//        System.out.println(firstInstance.getName() + " is instance number " + firstInstance.getNumInstances());
//        StaticTest secondInstance = new StaticTest("2nd Instance");
//        System.out.println(secondInstance.getName() + " is instance number " + secondInstance.getNumInstances());
//        StaticTest thirdInstance = new StaticTest("3rd Instance");
//        System.out.println(thirdInstance.getName() + " is instance number " + thirdInstance.getNumInstances());

//      This is the best way to use the method, set it to static!
        StaticTest firstInstance = new StaticTest("1st Instance");
        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());
        StaticTest secondInstance = new StaticTest("2nd Instance");
        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());
        StaticTest thirdInstance = new StaticTest("3rd Instance");
        System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getNumInstances());


//        Fields and methods use inside a static method should also be static!
//        But we have no problem accessing static fields and methods inside non static methods!
        int answer = multiply(6);
        System.out.println("Answer is " + answer);
        System.out.println("Multiplier is " + multiplier);
    }

    public static int multiply (int number) {
        return number * multiplier;
    }
}