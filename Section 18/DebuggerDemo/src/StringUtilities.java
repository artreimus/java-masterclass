public class StringUtilities {
    private StringBuilder sBuilder = new StringBuilder(); // init
    private int charsAdded = 0;

    public void addChar(StringBuilder sBuilder, char c) {
        sBuilder.append(c);
        charsAdded++;
    }

    public String upperAndPrefix(String str) {
        System.out.println("add prefix");
        String upper = str.toUpperCase();
        return "Prefix_" + upper;
    }

    public String addSuffix(String str) {
        System.out.println("add suffix");
        return str + "__Suffix";
    }
}
