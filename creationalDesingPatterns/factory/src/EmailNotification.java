public class EmailNotification implements Notification {

    @Override
    public void notifyUser(String message) {
        System.out.printf("%s. Отправлено электронное письмо\n", message);
    }
}
