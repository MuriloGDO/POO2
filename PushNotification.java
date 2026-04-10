public class PushNotification implements Notification{
    private GlobalConfig globalConfig;

    public PushNotification() {
        this.globalConfig = GlobalConfig.getInstance();
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Enviando mensagem: '" + message + "'.Enviado por Push");
    }
}
