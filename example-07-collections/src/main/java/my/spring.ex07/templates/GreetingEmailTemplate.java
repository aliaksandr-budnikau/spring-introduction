package my.spring.ex07.templates;

import my.spring.ex07.EmailDetails;
import my.spring.ex07.EmailType;
import org.springframework.stereotype.Component;

import static my.spring.ex07.EmailType.GREETING_EMAIL;

@Component
public class GreetingEmailTemplate implements EmailTemplate {

    @Override
    public String getContent(EmailDetails emailDetails) {
        return "Hello " + emailDetails.getRecipient() + "! Nice to see you.";
    }

    @Override
    public EmailType getEmailType() {
        return GREETING_EMAIL;
    }
}