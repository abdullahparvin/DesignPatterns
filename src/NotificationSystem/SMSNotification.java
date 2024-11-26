package NotificationSystem;

public class SMSNotification extends NotificationDecorator {
    public SMSNotification(Notification notification) {
        super(notification);
    }

    public void notify(String message) {
        super.notify(message);
        System.out.println("SMS Notification: " + message);
    }
}
