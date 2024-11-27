/**
 * A base decorator class for extending the functionality of notifications.
 * Implements the decorator design pattern by wrapping an existing {@link Notification} object.
 */

package NotificationSystem;

public class NotificationDecorator extends Notification{

    /**
     * The {@link Notification} instance being decorated.
     */
    protected Notification toBeDecorated;


    /**
     * Constructs a {@code NotificationDecorator} instance that wraps the specified notification.
     *
     * @param notification the {@link Notification} to be decorated.
     */
    public NotificationDecorator(Notification notification) {
        this.toBeDecorated = notification;
    }


    /**
     * Sends a notification by delegating the operation to the wrapped {@link Notification} instance.
     * Subclasses can extend this method to add additional behavior before or after delegating.
     *
     * @param message the message to be included in the notification.
     */
    @Override
    public void notify(String message) {
        toBeDecorated.notify(message);
    }
}
