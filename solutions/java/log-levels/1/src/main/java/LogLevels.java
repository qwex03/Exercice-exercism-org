public class LogLevels {
    
    public static String message(String logLine) {
        int index = logLine.indexOf(":");  // trouve le ":"
        String message = logLine.substring(index + 1);  // prend tout après
        return message.trim();
    }

    public static String logLevel(String logLine) {
        int index = logLine.indexOf("[") + 1;
        int index2 = logLine.indexOf("]");
        String message = logLine.substring(index, index2);
        return message.toLowerCase();
    }

    public static String reformat(String logLine) {
        int colonIndex = logLine.indexOf(":");
        String message = logLine.substring(colonIndex + 1).trim();

        int start = logLine.indexOf("[") + 1;
        int end = logLine.indexOf("]");
        String level = logLine.substring(start, end).toLowerCase();

        return message + " (" + level + ")";
    }
}
