package my.spring.repository;

import org.springframework.stereotype.Repository;

@Repository("firstRepository") // we can specify a name for our beans
public class FirstDataRepository implements DataRepository {

    public FirstDataRepository() {
        System.out.println(this.getClass().getSimpleName() + " was created");
    }
}
