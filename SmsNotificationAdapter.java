public class SmsNotificationAdapter implements Notification {
    private SmsExternalAPI smsApi;

    public SmsNotificationAdapter(SmsExternalAPI smsApi) {
        this.smsApi = smsApi;
    }

    @Override
    public void sendMessage(String message) {
        smsApi.smsSendMethod(message);
        System.out.println(" Sms via API externa");
    }
}