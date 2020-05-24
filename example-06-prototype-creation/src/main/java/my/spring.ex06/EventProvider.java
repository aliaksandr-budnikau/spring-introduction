package my.spring.ex06;

import my.spring.ex06.event.Event;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public interface EventProvider {

    @Lookup
    Event provideEvent();
}
