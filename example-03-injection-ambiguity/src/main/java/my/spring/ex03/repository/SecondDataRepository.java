package my.spring.ex03.repository;

import org.springframework.stereotype.Repository;

@Repository("secondRepository") // we can specify a name for our beans
public class SecondDataRepository implements DataRepository {

    public SecondDataRepository() {
        System.out.println(this.getClass().getSimpleName() + " was created");
    }
}
