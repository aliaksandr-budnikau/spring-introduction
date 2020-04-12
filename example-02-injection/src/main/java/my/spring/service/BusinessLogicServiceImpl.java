package my.spring.service;

import my.spring.component.OtherComponent;
import my.spring.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class BusinessLogicServiceImpl implements BusinessLogicService {

    @Autowired // by default, Spring resolves autowired entries by type.
    private DataRepository repository;

    @Inject // is part of the Java CDI standard introduced in Java EE 6 (JSR-299)
    private OtherComponent component;

    public BusinessLogicServiceImpl() {
        System.out.println(this.getClass().getSimpleName() + " was created");
    }
}
