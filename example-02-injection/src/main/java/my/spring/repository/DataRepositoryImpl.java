package my.spring.repository;

import org.springframework.stereotype.Repository;

@Repository
public class DataRepositoryImpl implements DataRepository {

    public DataRepositoryImpl() {
        System.out.println(this.getClass().getSimpleName() + " was created");
    }
}
