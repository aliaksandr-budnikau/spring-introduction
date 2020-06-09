package my.spring.ex03.component;

import org.springframework.stereotype.Component;

@Component("firstComponent") // we can specify a name for our beans
public class FirstComponent implements my.spring.ex03.component.OtherComponent {

    public FirstComponent() {
        System.out.println(this.getClass().getSimpleName() + " was created");
    }
}
