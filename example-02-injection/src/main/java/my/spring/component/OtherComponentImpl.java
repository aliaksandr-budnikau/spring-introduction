package my.spring.component;

import org.springframework.stereotype.Component;

@Component
public class OtherComponentImpl implements OtherComponent {

    public OtherComponentImpl() {
        System.out.println(this.getClass().getSimpleName() + " was created");
    }
}
