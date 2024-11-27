/**
 * Represents an email notification decorator in the notification system.
 * Extends the {@link NotificationDecorator} to add email notification functionality
 * to an existing {@link Notification}.
 */

package NotificationSystem;

public class EmailNotification extends NotificationDecorator {

    /**
     * Constructs an {@code EmailNotification} instance that wraps an existing notification.
     *
     * @param notification the base {@link Notification} to which email notification functionality will be added.
     */
    public EmailNotification(Notification notification) {
        super(notification);
    }


    /**
     * Sends a notification and adds email notification functionality.
     * Calls the wrapped notification's {@code notify} method and then
     * sends the email-specific notification.
     *
     * @param message the message to be included in the notification.
     */
    @Override
    public void notify(String message) {
        super.notify(message);
        emailNotify(message);
    }


    /**
     * Sends an email notification with the specified message.
     * Formats the message as an email notification and logs it to the system.
     *
     * @param message the message to be included in the email notification.
     */
    private void emailNotify(String message) {
        String emailMessage = "Email Notification: " + message;
        System.out.println(emailMessage);
        addToHistory(emailMessage);
    }
}
