package my.spring.service;

import my.spring.component.OtherComponent;
import my.spring.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessLogicServiceImpl implements BusinessLogicService {

    private final DataRepository repository;
    private final OtherComponent component;

    @Autowired // names of the arguments can be used for beans choosing 
    public BusinessLogicServiceImpl(DataRepository firstRepository, OtherComponent firstComponent) {
        System.out.println(this.getClass().getSimpleName() + " was created");
        this.repository = firstRepository;
        this.component = firstComponent;
    }
/*
    @Autowired // @Qualifier can be used for beans choosing as well
    public BusinessLogicServiceImpl(@Qualifier("secondRepository") DataRepository repository, @Qualifier("secondComponent") OtherComponent component) {
        System.out.println(this.getClass().getSimpleName() + " was created");
        this.repository = repository;
        this.component = component;
    }*/

    public void printDependencies() {
        System.out.println(repository.getClass().getSimpleName());
        System.out.println(component.getClass().getSimpleName());
    }
}
