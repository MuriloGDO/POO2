public class PushNotification implements Notification{
    private GlobalConfig globalConfig;

    public PushNotification() {
        this.globalConfig = GlobalConfig.getInstance();
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Enviando mensagem de push. Com no máximo " + globalConfig.getMaxTry() + " tentativas e no servidor " + globalConfig.getServer());
    }
}
