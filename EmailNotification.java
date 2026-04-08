public class EmailNotification implements Notification {
    private GlobalConfig globalConfig;

    public EmailNotification() {
        this.globalConfig = GlobalConfig.getInstance();
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Enviando mensagem de email. Com no máximo " + globalConfig.getMaxTry() + " tentativas e no servidor " + globalConfig.getServer());
    }
}