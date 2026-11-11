
class Notification {
    void sendNotification() {
        System.out.println("Sending Notification...");
    }
}

class EmailNotification extends Notification {
    @Override
    void sendNotification() {
        System.out.println("Email Notification Sent Successfully!");
    }
}

class SMSNotification extends Notification {
    @Override
    void sendNotification() {
        System.out.println("SMS Notification Sent Successfully!");
    }
}

class PushNotification extends Notification {
    @Override
    void sendNotification() {
        System.out.println("Push Notification Sent Successfully!");
    }
}

public class NotificationManagement {
    public static void main(String[] args) {

        EmailNotification e = new EmailNotification();
        SMSNotification s = new SMSNotification();
        PushNotification p = new PushNotification();

        e.sendNotification();
        s.sendNotification();
        p.sendNotification();
    }
}
