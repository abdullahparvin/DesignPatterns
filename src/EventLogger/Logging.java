package EventLogger;

import java.util.List;

public class Logging {
    public static void main(String[] args) {

        Logger logger = Logger.getInstance();

        int option = 0;
        switch (option) {
            case 0 -> {
                System.out.println("logging to file");
                logger.setUpFile("logs.txt");
            }
            case 1 -> System.out.println("logging to remote server");
            default -> System.out.println("logging to console only");
        }

        logger.log("INFO", "Running");
        logger.log("ERROR", "Syntax");
        
        List<String> history = logger.getLogHistory();
        System.out.println("History");
        for (String entry: history) {
            System.out.println(entry);
        }

        logger.archive("archivedLogs.txt");
    }
}
