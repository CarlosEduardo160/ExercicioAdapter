public class Main {
    public static void main(String[] args) {
        Notificador notificador = new EmailAdapter(new EmailService());
        notificador.enviar("Teste de adaptador Email");

        Notificador notificadorSms = new SmsAdapter(new SmsService());
        notificadorSms.enviar("Teste de apdator SMS");
    }
}
