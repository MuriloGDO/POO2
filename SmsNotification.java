public class SmsNotification implements Notification {
    private GlobalConfig globalConfig;

    public SmsNotification() {
        this.globalConfig = GlobalConfig.getInstance();
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Enviando mensagem de sms. Com no máximo " + globalConfig.getMaxTry() + " tentativas e no servidor " + globalConfig.getServer());
    }
}
