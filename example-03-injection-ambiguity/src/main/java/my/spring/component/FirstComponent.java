package my.spring.component;

import org.springframework.stereotype.Component;

@Component("firstComponent") // we can specify a name for our beans
public class FirstComponent implements OtherComponent {

    public FirstComponent() {
        System.out.println(this.getClass().getSimpleName() + " was created");
    }
}
