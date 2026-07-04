public class EmailAdapter implements Notificador{
    private EmailService emailService;

    public EmailAdapter(EmailService emailService){
        this.emailService = emailService;
    }

    @Override
    public void enviar(String mensagem) {
        emailService.sendEmail(mensagem);
    }
}
