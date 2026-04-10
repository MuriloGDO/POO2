public class NotificationProxy implements Notification {
    private Notification realObject;
    private GlobalConfig globalConfig = GlobalConfig.getInstance();

    public NotificationProxy(Notification realObject) {
        this.realObject = realObject;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("---Enviando mensagem pelo Proxy---");
        System.out.println("Pelo Servidor: " + globalConfig.getServer() + ".");
        System.out.println("Com no máximo " + globalConfig.getMaxTry() + " tentativas.");
        realObject.sendMessage(message);
    }
}