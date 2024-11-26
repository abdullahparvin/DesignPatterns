package EventLogger;

import java.util.List;

public class Logging {
    public static void main(String[] args) {

        Logger logger = Logger.getInstance();
        logger.log("INFO", "Running");
        logger.log("ERROR", "Syntax");
        
        List<String> history = logger.getLogHistory();
        System.out.println("History");
        for (String entry: history) {
            System.out.println(entry);
        }
    }
}
