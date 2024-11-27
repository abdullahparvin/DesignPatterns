package NotificationSystem;

public class PushNotification extends NotificationDecorator{

    public PushNotification(Notification notification) {
        super(notification);
    }

    @Override
    public void notify(String message) {
        super.notify(message);
        pushNotify(message);
    }

    private void pushNotify(String message) {
        String pushMessage = "WhatsApp Notification: " + message;
        System.out.println(pushMessage);
        addToHistory(pushMessage);
    }
}
