package NotificationSystem;

public class BasicNotification extends Notification {

    @Override
    public void notify(String message) {
        System.out.println("Basic Notification: " + message);
    }
}
