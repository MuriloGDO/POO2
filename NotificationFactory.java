public class NotificationFactory {
    public static Notification create(ChannelEnum channel) {
        Notification notification = switch (channel) {
            case SMS -> new PushNotification();
            case EMAIL -> new EmailNotification();
            case PUSH -> new PushNotification();
        };

        return new NotificationProxy(notification);
    }
}