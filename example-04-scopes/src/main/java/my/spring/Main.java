package my.spring;

import my.spring.service.BusinessLogicService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        for (int i = 0; i < 3; i++) {
            System.out.println("\niteration number #" + i);
            context.getBean(BusinessLogicService.class);
        }
    }
}
