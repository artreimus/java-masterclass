public class Main {
    public static void main(String[] args) {
        String result = SecondsAndMinutes.getDurationString(65L, -1);
        System.out.println(result);
        String secondResult = SecondsAndMinutes.getDurationString(120);
        System.out.println(secondResult);
    }
}
