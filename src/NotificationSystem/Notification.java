/**
 * An abstract base class representing a generic notification system.
 * Provides a foundation for sending notifications and managing a history of messages.
 */

package NotificationSystem;

import java.util.ArrayList;
import java.util.List;

public abstract class Notification {
    private static final List<String> history = new ArrayList<>();


    /**
     * Sends a notification with the specified message.
     * Subclasses can override this method to implement specific notification behavior.
     *
     * @param message the message to be included in the notification.
     */
    public void notify(String message) {
        addToHistory(message);
    }


    /**
     * Retrieves the history of all notifications sent.
     *
     * @return a list of all notification messages in the history.
     */
    public List<String> getHistory() {
        return history;
    }


    /**
     * Adds a message to the notification history.
     * This method is used internally by the {@code notify} method and other subclasses
     * to log messages in the notification history.
     *
     * @param message the message to be added to the history.
     */
    void addToHistory(String message) {
        history.add(message + '\n');
    }
}
