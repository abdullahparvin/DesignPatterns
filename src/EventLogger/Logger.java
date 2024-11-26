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

        if (fileWriter != null) {

            try {
                fileWriter.write(logged + "\n");
                fileWriter.flush();

            } catch (IOException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }

    public List<String> getLogHistory() {
        return history;
    }

    public void setUpFile(String loggerFile) {
        try {
            fileWriter = new FileWriter(loggerFile, true);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

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
