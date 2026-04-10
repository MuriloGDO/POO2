public class SmsNotificationAdapter implements Notification {
    private GlobalConfig globalConfig;
    private SmsExternalAPI smsApi;

    public SmsNotificationAdapter(SmsExternalAPI smsApi) {
        this.globalConfig = GlobalConfig.getInstance();
        this.smsApi = smsApi;
    }

    @Override
    public void sendMessage(String message) {
        smsApi.smsSendMethod(message);
        System.out.println(" Com no máximo " + globalConfig.getMaxTry() + " tentativas e no servidor " + globalConfig.getServer());
    }
}