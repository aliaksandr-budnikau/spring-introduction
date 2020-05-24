package my.spring.ex07;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static my.spring.ex07.EmailType.GREETING_EMAIL;
import static my.spring.ex07.EmailType.NOTIFICATION_EMAIL;

// TO_SHOW Switch
// TO_SHOW Chain of responsibilities
// TO_SHOW Map injection
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("my.spring");
        EmailSender emailSender = applicationContext.getBean(EmailSender.class);

        emailSender.send(new EmailDetails(GREETING_EMAIL, "Alex"));
        System.out.println();
        emailSender.send(new EmailDetails(NOTIFICATION_EMAIL, "Bob"));
        System.out.println();
        //emailSender.send(new EmailDetails(INVITATION_EMAIL, "Mark"));
    }
}
