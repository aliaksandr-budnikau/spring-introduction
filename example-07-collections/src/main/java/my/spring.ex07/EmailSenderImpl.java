package my.spring.ex07;

import org.springframework.stereotype.Component;

@Component
public class EmailSenderImpl implements EmailSender {

    public void send(EmailDetails emailDetails) {
        switch (emailDetails.getType()) {
            case GREETING_EMAIL:
                System.out.println("Hello " + emailDetails.getRecipient() + "! Nice to see you.");
                break;
            case NOTIFICATION_EMAIL:
                System.out.println("Hello " + emailDetails.getRecipient() + "! We notify you about something.");
                break;
            default:
                throw new UnsupportedOperationException("Unknown email type: " + emailDetails.getType());
        }
    }
}