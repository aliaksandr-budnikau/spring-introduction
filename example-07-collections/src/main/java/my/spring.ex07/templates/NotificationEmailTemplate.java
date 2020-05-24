package my.spring.ex07.templates;

import my.spring.ex07.EmailDetails;
import my.spring.ex07.EmailType;
import org.springframework.stereotype.Component;

import static my.spring.ex07.EmailType.NOTIFICATION_EMAIL;

@Component
public class NotificationEmailTemplate implements EmailTemplate {

    @Override
    public String getContent(EmailDetails emailDetails) {
        return "Hello " + emailDetails.getRecipient() + "! We notification you about something.";
    }

    @Override
    public EmailType getEmailType() {
        return NOTIFICATION_EMAIL;
    }
}