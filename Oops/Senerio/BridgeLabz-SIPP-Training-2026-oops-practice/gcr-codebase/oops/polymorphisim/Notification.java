package gcr-codebase.polymorphisim;

// Superclass
class Notification {

    String recipientName;
    String message;

    Notification(String recipientName, String message) {
        this.recipientName = recipientName;
        this.message = message;
    }

    void sendNotification() {
        System.out.println("Sending Notification");
    }
}

// Subclass 1
class EmailNotification extends Notification {

    EmailNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    void sendNotification() {
        System.out.println("Email sent to " + recipientName + " : " + message);
    }
}

// Subclass 2
class SMSNotification extends Notification {

    SMSNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    void sendNotification() {
        System.out.println("SMS sent to " + recipientName + " : " + message);
    }
}

// Subclass 3
class PushNotification extends Notification {

    PushNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    void sendNotification() {
        System.out.println("Push Notification sent to " + recipientName + " : " + message);
    }
}

// Main class
public class Notification {

    public static void main(String[] args) {

        Notification[] notifications = {
            new EmailNotification("Amit", "Welcome!"),
            new SMSNotification("Rahul", "OTP: 1234"),
            new PushNotification("Neha", "New Offer Available")
        };

        // Dynamic Method Dispatch
        for (Notification n : notifications) {
            n.sendNotification();
        }
    }
}
