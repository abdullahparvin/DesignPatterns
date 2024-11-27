package NotificationSystem;

public class Notifying {

    public static void main(String[] args){

        Notification preference;

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
        }
        //Continue hardcoding notification preferences

        preference.notify("System update at 10 PM tonight.");
        System.out.println();

        System.out.println(preference.getHistory());

    }
}
