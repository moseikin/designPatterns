public class SmsNotification implements Notification {

    @Override
    public void notifyUser(String message) {
        System.out.printf("%s. Отправлено посредством СМС сообщения\n", message);
    }
}
