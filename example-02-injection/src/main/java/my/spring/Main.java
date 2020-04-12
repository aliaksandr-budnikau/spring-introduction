package my.spring;

import my.spring.service.BusinessLogicService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        BusinessLogicService service = context.getBean(BusinessLogicService.class);
    }
}
