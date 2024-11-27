/**
 * Demonstrates the usage of the Logger class.
 * Sets up logging, logs events, displays log history, and archives logs.
 *
 */

package EventLogger;

import java.util.List;

public class Logging {
    public static void main(String[] args) {

        Logger logger = Logger.getInstance();

        // Set up the logging option: file, remote server, or console.
        // Can be further extended
        int option = 0;
        switch (option) {
            case 0 -> {
                System.out.println("logging to file");
                logger.setUpFile("logs.txt");
            }
            case 1 -> System.out.println("logging to remote server");
            default -> System.out.println("logging to console only");
        }

        // Log events with different severity levels.
        logger.log("INFO", "Running");
        logger.log("ERROR", "Syntax");

        // Retrieve and display the log history.
        List<String> history = logger.getLogHistory();
        System.out.println("History");
        for (String entry: history) {
            System.out.println(entry);
        }

        // Archive the logs and clear the log history.
        logger.archive("archivedLogs.txt");
    }
}
