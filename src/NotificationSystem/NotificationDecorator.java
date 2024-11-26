package NotificationSystem;

public class NotificationDecorator extends Notification{
    protected Notification toBeDecorated;

    public NotificationDecorator(Notification notification) {
        this.toBeDecorated = notification;
    }

    @Override
    public void notify(String message) {
        toBeDecorated.notify(message);
    }
}
