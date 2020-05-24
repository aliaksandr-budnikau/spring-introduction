package my.spring.ex07.templates;

import my.spring.ex07.EmailDetails;
import my.spring.ex07.EmailType;

public interface EmailTemplate {

    String getContent(EmailDetails emailDetails);

    EmailType getEmailType();

}