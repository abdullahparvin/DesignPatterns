/**
 * Singleton Logger class for logging events with various severity levels.
 * Provides functionality to log messages with timestamps, save logs to a file,
 * retrieve log history, and archive log entries to a specified file.
 */

package EventLogger;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Logger {

    private static Logger uniqueInstance;
    private final List<String> history = new ArrayList<>();

    private FileWriter fileWriter;

    /**
     * Private constructor to enforce singleton pattern.
     */
    private Logger() {}

    /**
     * Retrieves the singleton instance of the Logger class.
     * If no instance exists, a new one is created.
     *
     * @return the singleton instance of the Logger.
     */
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

    /**
     * Logs a message with a given severity level and a timestamp.
     * The log entry is added to the log history and optionally written to a file.
     *
     * @param severityLevel the severity level of the log (e.g., INFO, ERROR, DEBUG).
     * @param message       the message to be logged.
     */
    public void log(String severityLevel, String message) {
        String timestamp = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss").format(new Date());
        String logged = (timestamp + ", " + severityLevel + ": " + message);
        System.out.println(logged);
        history.add(logged);

        if (fileWriter != null) {

            try {
                fileWriter.write(logged + "\n");
                fileWriter.flush();

            } catch (IOException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }

    /**
     * Retrieves the history of all logged messages.
     *
     * @return a list of all log entries.
     */
    public List<String> getLogHistory() {
        return history;
    }

    /**
     * Sets up the logger to write log entries to a specified file.
     * If the file does not exist, it will be created.
     *
     * @param loggerFile the file to write log entries to.
     */
    public void setUpFile(String loggerFile) {
        try {
            fileWriter = new FileWriter(loggerFile, true);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    /**
     * Archives all log entries to a specified file and clears the log history.
     * Existing content in the archive file will be overwritten.
     *
     * @param archiveFile the file to write archived log entries to.
     */
    public void archive(String archiveFile) {
        try (FileWriter writer = new FileWriter(archiveFile)) {
            for (String entry : history) {
                writer.write(entry + "\n");
            }
            history.clear();
            System.out.println("Logs have been successfully archived");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
