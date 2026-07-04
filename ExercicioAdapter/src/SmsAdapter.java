public class SmsAdapter implements Notificador {
    private SmsService smsService;

    public SmsAdapter(SmsService smsService) {
        this.smsService = smsService;
    }

    @Override
    public void enviar(String mensagem) {
        smsService.enviarSms(mensagem);
    }
}
