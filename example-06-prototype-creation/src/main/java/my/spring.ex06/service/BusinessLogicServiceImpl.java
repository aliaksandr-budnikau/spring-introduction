package my.spring.ex06.service;

import my.spring.ex06.EventProvider;
import my.spring.ex06.event.Event;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class BusinessLogicServiceImpl implements BusinessLogicService {

    @Autowired
    private ApplicationContext context;

    @Autowired
    private ObjectProvider<Event> eventObjectProvider;

    @Autowired
    private EventProvider eventProvider;

    public void doSomeLogic() {
        //EventProvider eventProvider = context.getBean(EventProvider.class); // 99
        //Event event = context.getBean(Event.class); // 3043
        //Event event = new Event(); // 8
        //Event event = eventObjectProvider.getObject();  // 6342
        //Event event = eventProvider.provideEvent(); // 3271
        //event.doSomething();
    }
}
