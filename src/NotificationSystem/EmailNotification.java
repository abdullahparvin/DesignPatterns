package NotificationSystem;

public class EmailNotification extends NotificationDecorator {

    public EmailNotification(Notification notification) {
        super(notification);
    }

    @Override
    public void notify(String message) {
        super.notify(message);
        emailNotify(message);
    }

    private void emailNotify(String message) {
        String emailMessage = "Email Notification: " + message;
        System.out.println(emailMessage);
        addToHistory(emailMessage);
    }
}
