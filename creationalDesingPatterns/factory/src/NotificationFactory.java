public class NotificationFactory {

    public Notification createNotification(String channel) {
        if (channel.equals(ChannelEnum.SMS.getChannel())) {
            return new SmsNotification();
        } else if (channel.equals(ChannelEnum.PUSH.getChannel())) {
            return new PushNotification();
        } else if (channel.equals(ChannelEnum.EMAIL.getChannel())) {
            return new EmailNotification();
        } else {
            throw new IllegalStateException("Такой канал отправки сообщений не зарегистрирован");
        }
    }
}
