/**
 * A decorator class that adds push notification functionality to an existing {@link Notification}.
 * Extends the {@link NotificationDecorator} to implement the decorator design pattern.
 * Specifically, this implementation simulates a WhatsApp push notification.
 */

package NotificationSystem;

public class PushNotification extends NotificationDecorator{


    /**
     * Constructs a {@code PushNotification} instance that wraps the specified notification.
     *
     * @param notification the base {@link Notification} to which push notification functionality will be added.
     */
    public PushNotification(Notification notification) {
        super(notification);
    }


    /**
     * Sends a notification by delegating to the wrapped {@link Notification} and
     * adding push notification functionality.
     *
     * @param message the message to be included in the notification.
     */
    @Override
    public void notify(String message) {
        super.notify(message);
        pushNotify(message);
    }


    /**
     * Sends a push notification with the specified message.
     * Formats the message, prints it to the console, and logs it in the notification history.
     *
     * @param message the message to be included in the push notification.
     */
    private void pushNotify(String message) {
        String pushMessage = "Push Notification: " + message;
        System.out.println(pushMessage);
        addToHistory(pushMessage);
    }
}
