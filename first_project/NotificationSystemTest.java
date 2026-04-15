import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class NotificationSystemTest {

    @Test
    @DisplayName("Deve garantir que o GlobalConfig é um Singleton")
    void testSingleton() {
        GlobalConfig instance1 = GlobalConfig.getInstance();
        GlobalConfig instance2 = GlobalConfig.getInstance();
        assertSame(instance1, instance2, "As instâncias de GlobalConfig devem ser idênticas");
    }

    @Test
    @DisplayName("Deve garantir que a Factory sempre retorna um Proxy")
    void testFactoryProxy() {
        Notification notification = NotificationFactory.create(ChannelEnum.SMS);
        
        assertTrue(notification instanceof NotificationProxy, 
            "A Factory deveria envolver a notificação em um Proxy");
    }

    @Test
    @DisplayName("Deve garantir que o SMS utiliza o Adapter via API Externa")
    void testSmsAdapterIntegration() {
        assertDoesNotThrow(() -> {
            Notification sms = NotificationFactory.create(ChannelEnum.SMS);
            sms.sendMessage("Mensagem de teste unitário");
        }, "O fluxo entre Proxy -> Adapter -> API Externa deve funcionar sem erros");
    }
}