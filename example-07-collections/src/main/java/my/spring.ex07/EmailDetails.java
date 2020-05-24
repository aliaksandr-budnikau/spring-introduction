package my.spring.ex07;

public class EmailDetails {

    private EmailType type;
    private String recipient;

    public EmailDetails(EmailType type, String recipient) {
        this.type = type;
        this.recipient = recipient;
    }

    public EmailType getType() {
        return type;
    }

    public String getRecipient() {
        return recipient;
    }
}
