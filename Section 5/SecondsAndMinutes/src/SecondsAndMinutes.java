public class SecondsAndMinutes {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static String getDurationString(long minutes, double seconds) {
        if((minutes < 0) || (seconds < 0 || seconds > 59)) return INVALID_VALUE_MESSAGE;
        long calculatedHours = minutes / 60;
        long calculatedMinutes = minutes % 60;
        double calculatedSeconds = seconds % 60;

        String hoursString = calculatedHours + "h";
        String minutesString = calculatedMinutes + "m";
        String secondsString = calculatedSeconds + "s";

        if(calculatedHours < 10) {
            hoursString = "0" + hoursString;
        }
        if(calculatedMinutes < 10) {
            minutesString = "0" + minutesString;
        }
        if(calculatedSeconds < 10) {
            secondsString = "0" + secondsString;
        }
        return (hoursString + " " +  minutesString + " " + secondsString);
    }

    public static String getDurationString(double seconds) {
        if(seconds < 0) return INVALID_VALUE_MESSAGE;
        long calculatedMinutes = (int) seconds / 60;
        double calculatedSeconds = seconds % 60;
        return getDurationString(calculatedMinutes, calculatedSeconds);
    }
}
