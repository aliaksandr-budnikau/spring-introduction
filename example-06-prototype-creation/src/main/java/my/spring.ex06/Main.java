package my.spring.ex06;

import my.spring.ex06.service.BusinessLogicService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.StopWatch;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        BusinessLogicService service = context.getBean(BusinessLogicService.class);
        StopWatch watch = new StopWatch();
        watch.start();
        for (int i = 0; i < 100000; i++) {
            service.doSomeLogic();
        }
        watch.stop();
        System.out.println(watch.getLastTaskInfo().getTimeMillis());
    }
}
