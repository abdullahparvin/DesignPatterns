package NotificationSystem;

public class BasicNotification extends Notification {
    @Override
    public void notify(String message) {
        super.notify("Basic Notification: " + message);
        System.out.println("Basic Notification: " + message);
    }
}
