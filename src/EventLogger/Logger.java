package EventLogger;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Logger {

    private static Logger uniqueInstance;
    private final List<String> history = new ArrayList<>();

    private Logger() {}

    public static Logger getInstance() {
        if (uniqueInstance == null) {
            synchronized (Logger.class) {
                if (uniqueInstance == null) {
                    System.out.println("Creating unique Logger instance");
                    uniqueInstance = new Logger();
                }
            }
        }
        System.out.println("Returning instance of Logger");
        return uniqueInstance;
    }

    public void log(String severityLevel, String message) {
        String timestamp = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss").format(new Date());
        String logged = (timestamp + ", " + severityLevel + ": " + message);
        System.out.println(logged);
        history.add(logged);
    }

    public List<String> getLogHistory() {
        return history;
    }
}
