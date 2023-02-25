public class FactoryMain {

    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        String message = "Текст сообщения";

        Notification sms = notificationFactory.createNotification(ChannelEnum.SMS.getChannel());
        sms.notifyUser(message);

        Notification email = notificationFactory.createNotification(ChannelEnum.EMAIL.getChannel());
        email.notifyUser(message);

        Notification push = notificationFactory.createNotification(ChannelEnum.PUSH.getChannel());
        push.notifyUser(message);
    }
}
