package my.spring.ex03;

import my.spring.ex03.service.BusinessLogicService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// TO_SHOW beans ids in a class names/annotation
// TO_SHOW ver/arg names
// TO_SHOW @Qualifier
// TO_SHOW Custom annotations
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        BusinessLogicService service = context.getBean(BusinessLogicService.class);
        System.out.println("\n");
        service.printDependencies();
    }
}
