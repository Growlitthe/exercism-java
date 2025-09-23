public class LogLevels {
    
    public static String message(String logLine) {
        int x = logLine.indexOf("]:");
        String str = logLine.substring(x+3);

        return str.trim();
    }

    public static String logLevel(String logLine) {
        int indexOf = logLine.indexOf("[");
        int indexOf2 = logLine.indexOf("]");
        String str = logLine.substring(indexOf+1, indexOf2);
        
        return str.toLowerCase();
        
    }

    public static String reformat(String logLine) {
        int indexOf2 = logLine.indexOf("]:");
        String str = logLine.substring(indexOf2+3).trim();

        int indexOf1 = logLine.indexOf("[");
        String str2 = logLine.substring(indexOf1+1, indexOf2).trim();
        
        return (str + " (" + str2.toLowerCase() +")");
    }
}
