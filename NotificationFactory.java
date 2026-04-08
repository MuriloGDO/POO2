public class NotificationFactory {
    public static Notification create(ChannelEnum channel) {
        return switch (channel) {
            case SMS -> new PushNotification();
            case EMAIL -> new EmailNotification();
            case PUSH -> new PushNotification();
        };
    }
}