package my.spring.repository;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;
import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_SINGLETON;

@Repository
@Scope(SCOPE_SINGLETON) // is useless here since it is a singleton by default
public class DataRepositoryImpl implements DataRepository {

    public DataRepositoryImpl() {
        System.out.println(this.getClass().getSimpleName() + " was created");
    }
}
