package my.spring.service;

import my.spring.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessLogicServiceImpl implements BusinessLogicService {

    private final DataRepository repository;

    @Autowired
    public BusinessLogicServiceImpl(DataRepository repository) {
        System.out.println(this.getClass().getSimpleName() + " was created");
        this.repository = repository;
    }

    public String doSomeLogic() {
        return "result: {" + repository.getData() + "}";
    }
}
