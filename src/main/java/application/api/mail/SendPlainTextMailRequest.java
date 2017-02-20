package application.api.mail;

public class SendPlainTextMailRequest {

    public final String to;
    public final String subject;
    public final String text;

    public SendPlainTextMailRequest(String to, String subject, String text) {
        this.to = to;
        this.subject = subject;
        this.text = text;
    }

}
