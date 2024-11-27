package NotificationSystem;

public class SlackNotification extends NotificationDecorator {
    public SlackNotification(Notification notification) {
        super(notification);
    }

    @Override
    public void notify(String message) {
        super.notify(message);
        slackNotify(message);
    }

    private void slackNotify(String message) {
        String slackMessage = "Slack Notification: " + message;
        System.out.println(slackMessage);
        addToHistory(slackMessage);
    }


}
