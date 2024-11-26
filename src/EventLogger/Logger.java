package EventLogger;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    private static Logger uniqueInstance;

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
}
