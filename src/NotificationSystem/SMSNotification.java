package NotificationSystem;

public class SMSNotification extends NotificationDecorator {
    public SMSNotification(Notification notification) {
        super(notification);
    }

    @Override
    public void notify(String message) {
        super.notify(message);
        SMSNotify(message);
    }

    private void SMSNotify(String message) {
        String SMSMessage = "SMS Notification: " + message;
        System.out.println(SMSMessage);
        addToHistory(SMSMessage);
    }
}
