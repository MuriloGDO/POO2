public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE NOTIFICAÇÃO ===\n");

        Notification notification = NotificationFactory.create(ChannelEnum.SMS);

        System.out.println("--- Testando Envio de SMS (Com Adapter e Proxy) ---");
        notification.sendMessage("Olá! Seu token é 9988.");
        
        System.out.println("\n--- Testando Envio de Email (Com Proxy) ---");
        Notification email = NotificationFactory.create(ChannelEnum.EMAIL);
        email.sendMessage("Bem-vindo ao sistema!");

        System.out.println("\n=== FIM DO TESTE ===");
    }
}