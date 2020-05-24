package my.spring.ex06.event;

import my.spring.ex06.EventProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public abstract class AbstractEvent {

    @Value("${event.config}")
    private String config;

    @Autowired
    private EventProvider eventProvider;

    public void doSomething() {
        if (eventProvider == null || !"some config".equals(config)) {
            throw new RuntimeException();
        }
    }
}