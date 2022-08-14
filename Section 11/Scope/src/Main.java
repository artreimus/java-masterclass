public class Main {
//    Scope visibility of a class member of variable

    public static void main(String[] args) {
        String varFour = "this is private to main";
        ScopeCheck scopeCheck = new ScopeCheck();
        System.out.println("scopeCheck varOne is " + scopeCheck.getVarOne());
        System.out.println(varFour);
        scopeCheck.timesTwo();
        scopeCheck.useInner();

        System.out.println("-------------------------");

        ScopeCheck.InnerClass innerClass = scopeCheck.new InnerClass();
//        innerClass.timesTwo();
//        System.out.println("varThree is not accessible here " + innerClass.varThree); // Can't access varThree outside of its outer class (parent)!
    }
}