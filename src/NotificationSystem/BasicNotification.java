/**
 * Represents a basic notification type in the notification system.
 * Extends the {@link Notification} class to provide a basic implementation
 * of the notification functionality.
 */

package NotificationSystem;

public class BasicNotification extends Notification {

    /**
     * Sends a basic notification with the specified message.
     * Prepends "Basic Notification: " to the message and uses the
     * {@code notify} method from the parent {@link Notification} class
     * to handle further processing.
     *
     * @param message the message to include in the notification.
     */
    @Override
    public void notify(String message) {
        super.notify("Basic Notification: " + message);
        System.out.println("Basic Notification: " + message);
    }
}
