/**
 * A decorator class that adds WhatsApp notification functionality to an existing {@link Notification}.
 * Extends the {@link NotificationDecorator} to implement the decorator design pattern.
 */

package NotificationSystem;

public class WhatsAppNotification extends NotificationDecorator {

    /**
     * Constructs a {@code WhatsAppNotification} instance that wraps the specified notification.
     *
     * @param notification the base {@link Notification} to which WhatsApp notification functionality will be added.
     */
    public WhatsAppNotification(Notification notification) {
        super(notification);
    }


    /**
     * Sends a notification by delegating to the wrapped {@link Notification} and
     * adding WhatsApp notification functionality.
     *
     * @param message the message to be included in the notification.
     */
    @Override
    public void notify(String message) {
        super.notify(message);
        whatsAppNotify(message);
    }


    /**
     * Sends a WhatsApp notification with the specified message.
     * Formats the message, prints it to the console, and logs it in the notification history.
     *
     * @param message the message to be included in the WhatsApp notification.
     */
    private void whatsAppNotify(String message) {
        String whatsAppMessage = "WhatsApp Notification: " + message;
        System.out.println(whatsAppMessage);
        addToHistory(whatsAppMessage);
    }
}
