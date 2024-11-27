package NotificationSystem;

public class WhatsAppNotification extends NotificationDecorator {

    public WhatsAppNotification(Notification notification) {
        super(notification);
    }

    @Override
    public void notify(String message) {
        super.notify(message);
        whatsAppNotify(message);
    }

    private void whatsAppNotify(String message) {
        String whatsAppMessage = "WhatsApp Notification: " + message;
        System.out.println(whatsAppMessage);
        addToHistory(whatsAppMessage);
    }
}
