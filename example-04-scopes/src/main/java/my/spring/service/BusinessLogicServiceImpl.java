package my.spring.service;

import my.spring.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_SINGLETON;

@Service
//@Scope(SCOPE_PROTOTYPE) // the app context returns a NEW bean each time we request beans of this type
@Scope(SCOPE_SINGLETON) // the app context returns the same singleton bean of this type each time we request
public class BusinessLogicServiceImpl implements BusinessLogicService {

    private final DataRepository repository;

    @Autowired
    public BusinessLogicServiceImpl(DataRepository repository) {
        System.out.println(this.getClass().getSimpleName() + " was created");
        this.repository = repository;
    }
}
