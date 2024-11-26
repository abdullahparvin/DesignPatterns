package EventLogger;

public class Logging {
    public static void main(String[] args) {

        Logger logger = Logger.getInstance();
        logger.log("INFO", "Running");
    }
}
