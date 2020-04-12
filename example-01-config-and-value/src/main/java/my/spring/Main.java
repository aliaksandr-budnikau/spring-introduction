package my.spring;

import my.spring.components.Config;
import my.spring.components.GoodsResourceProvider;
import my.spring.components.ResourceProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        ResourceProvider resourceProvider = context.getBean("usersResourceProvider", ResourceProvider.class);
        resourceProvider.getResource();

        ResourceProvider myResourceProvider1 = context.getBean("goodsResourceProvider", ResourceProvider.class);
        myResourceProvider1.getResource();

        new GoodsResourceProvider().getResource();
    }
}
