/**
 * A demonstration class for the notification system.
 * Uses a chain of decorators to dynamically configure notification preferences
 * and send a message through the selected notification methods.
 */

package NotificationSystem;

public class Notifying {


    /**
     * The entry point of the application.
     * Configures a notification system based on a selected option and demonstrates
     * sending a notification. The configuration uses a chain of decorators to add
     * different types of notifications (e.g., SMS, Email, Slack).
     */
    public static void main(String[] args){

        Notification preference;

        // Select notification preference based on the option.
        int option = 3;
        switch (option) {
            case 0:
                preference = new BasicNotification();
                break;
            case 1:
                preference = new SMSNotification(new BasicNotification());
                break;
            case 2:
                preference = new EmailNotification(new SMSNotification(new BasicNotification()));
                break;
            case 3:
                preference = new SlackNotification(new EmailNotification(new SMSNotification(new BasicNotification())));
                break;
            case 4:
                preference = new SlackNotification(new BasicNotification());
                break;
            default:
                preference = new SlackNotification(new EmailNotification(new SMSNotification(new BasicNotification())));
        } //Continue hardcoding notification preferences

        // Send a notification with the configured preference.
        preference.notify("System update at 10 PM tonight.");
        System.out.println();

        // Print the notification history.
        System.out.println(preference.getHistory());

    }
}
