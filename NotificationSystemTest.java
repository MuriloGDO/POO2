// import org.junit.jupiter.api.Test;
// import org.junit.jupiter.api.DisplayName;
// import static org.junit.jupiter.api.Assertions.*;

// class NotificationSystemTest {

//     @Test
//     @DisplayName("Deve garantir que o GlobalConfig é um Singleton")
//     void testSingleton() {
//         GlobalConfig instance1 = GlobalConfig.getInstance();
//         GlobalConfig instance2 = GlobalConfig.getInstance();

//         assertSame(instance1, instance2, "As instâncias de GlobalConfig devem ser idênticas");
//     }

//     @Test
//     @DisplayName("Deve criar instâncias corretas através da Factory")
//     void testFactoryCreation() {
//         Notification sms = NotificationFactory.create(ChannelEnum.SMS);
//         Notification email = NotificationFactory.create(ChannelEnum.EMAIL);
//         Notification push = NotificationFactory.create(ChannelEnum.PUSH);

//         assertTrue(sms instanceof SmsNotification, "Deveria ser uma instância de SmsNotification");
//         assertTrue(email instanceof EmailNotification, "Deveria ser uma instância de EmailNotification");
//         assertTrue(push instanceof PushNotification, "Deveria ser uma instância de PushNotification");
//     }
// }