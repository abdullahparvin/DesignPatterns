/**
 * A decorator class that adds SMS notification functionality to an existing {@link Notification}.
 * Extends the {@link NotificationDecorator} to implement the decorator design pattern.
 */
package NotificationSystem;

public class SMSNotification extends NotificationDecorator {

    /**
     * Constructs an {@code SMSNotification} instance that wraps the specified notification.
     *
     * @param notification the base {@link Notification} to which SMS notification functionality will be added.
     */
    public SMSNotification(Notification notification) {
        super(notification);
    }


    /**
     * Sends a notification by delegating to the wrapped {@link Notification} and
     * adding SMS notification functionality.
     *
     * @param message the message to be included in the notification.
     */
    @Override
    public void notify(String message) {
        super.notify(message);
        SMSNotify(message);
    }


    /**
     * Sends an SMS notification with the specified message.
     * Formats the message, prints it to the console, and logs it in the notification history.
     *
     * @param message the message to be included in the SMS notification.
     */
    private void SMSNotify(String message) {
        String SMSMessage = "SMS Notification: " + message;
        System.out.println(SMSMessage);
        addToHistory(SMSMessage);
    }
}
