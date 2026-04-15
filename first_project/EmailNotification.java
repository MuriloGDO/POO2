public class EmailNotification implements Notification {

    public EmailNotification() { }

    @Override
    public void sendMessage(String message) {
        System.out.println("Enviando mensagem: '" + message + "'. Enviado por Email");
    }
}