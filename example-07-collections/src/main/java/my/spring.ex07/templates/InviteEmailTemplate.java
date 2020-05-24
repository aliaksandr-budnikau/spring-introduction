package my.spring.ex07.templates;

import my.spring.ex07.EmailDetails;
import my.spring.ex07.EmailType;

import static my.spring.ex07.EmailType.INVITATION_EMAIL;

//@Component
public class InviteEmailTemplate implements EmailTemplate {

    @Override
    public String getContent(EmailDetails emailDetails) {
        return "Hello " + emailDetails.getRecipient() + "! We invite you.";
    }

    @Override
    public EmailType getEmailType() {
        return INVITATION_EMAIL;
    }
}