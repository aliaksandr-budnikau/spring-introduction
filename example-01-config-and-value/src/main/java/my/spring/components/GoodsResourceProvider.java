package my.spring.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("goodsResourceProvider")
public class GoodsResourceProvider implements ResourceProvider {

    @Value("${my.spring.resource_goods}")
    private String resourceName;

    public void getResource() {
        System.out.println("getting a resource " + resourceName);
    }
}
