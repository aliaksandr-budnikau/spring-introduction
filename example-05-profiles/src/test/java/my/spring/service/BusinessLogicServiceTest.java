package my.spring.service;

import my.spring.Config;
import my.spring.repository.DataRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
@ActiveProfiles("test")
public class BusinessLogicServiceTest {

    @Autowired
    private BusinessLogicService businessLogicService;
    @Autowired
    private DataRepository repository;

    @Test
    public void test() {
        //when(repository.getData()).thenReturn("mock data");
        System.out.println(businessLogicService.doSomeLogic());
    }
}