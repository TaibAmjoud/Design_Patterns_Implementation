package factory;

public class SmsFactory extends NotificationFactory{
    public Notification createNotification() {
        return new SmsNotification();
    }
}
