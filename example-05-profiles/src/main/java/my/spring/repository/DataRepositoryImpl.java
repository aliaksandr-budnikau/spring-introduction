package my.spring.repository;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("prod") // this way we can mark this class to be used only for a production env.
//@Profile("!test") // this way we can mark this class to be used only NOT for a test env.
public class DataRepositoryImpl implements DataRepository {

    public DataRepositoryImpl() {
        System.out.println(this.getClass().getSimpleName() + " was created");
    }

    public String getData() {
        return "prod data";
    }
}
