public class PushNotification implements Notification {

    @Override
    public void notifyUser(String message) {
        System.out.printf("%s. Отправлено PUSH сообщение\n", message);
    }
}
