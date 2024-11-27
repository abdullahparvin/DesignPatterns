/**
 * A decorator class that adds Slack notification functionality to an existing {@link Notification}.
 * Extends the {@link NotificationDecorator} to implement the decorator design pattern.
 */

package NotificationSystem;

public class SlackNotification extends NotificationDecorator {

    /**
     * Constructs a {@code SlackNotification} instance that wraps the specified notification.
     *
     * @param notification the base {@link Notification} to which Slack notification functionality will be added.
     */
    public SlackNotification(Notification notification) {
        super(notification);
    }

    /**
     * Sends a notification by delegating to the wrapped {@link Notification} and
     * adding Slack notification functionality.
     *
     * @param message the message to be included in the notification.
     */
    @Override
    public void notify(String message) {
        super.notify(message);
        slackNotify(message);
    }


    /**
     * Sends a Slack notification with the specified message.
     * Formats the message, prints it to the console, and logs it in the notification history.
     *
     * @param message the message to be included in the Slack notification.
     */
    private void slackNotify(String message) {
        String slackMessage = "Slack Notification: " + message;
        System.out.println(slackMessage);
        addToHistory(slackMessage);
    }
}
