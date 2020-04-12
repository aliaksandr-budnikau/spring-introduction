package my.spring;

import my.spring.service.BusinessLogicService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
/*        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("prod");
        context.register(Config.class);
        context.refresh();*/

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        BusinessLogicService service = context.getBean(BusinessLogicService.class);
        System.out.println(service.doSomeLogic());
    }
}
