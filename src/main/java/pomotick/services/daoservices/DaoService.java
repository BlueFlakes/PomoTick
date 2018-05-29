package pomotick.services.daoservices;

import org.springframework.data.repository.CrudRepository;
import pomotick.exceptions.ApplicationException;

public abstract class DaoService<T, R extends CrudRepository<T, Long>> {
    private R repository;

    protected DaoService(R repository) {
        this.repository = repository;
    }

    public T getById(Long id) throws ApplicationException {
        return this.repository.findOne(id);
    }

    public Iterable<T> getAll() throws ApplicationException {
        return this.repository.findAll();
    }

    public T save(T obj) throws ApplicationException {
        return this.repository.save(obj);
    }

    public Iterable<T> save(Iterable<T> iterable) throws ApplicationException {
        return this.repository.save(iterable);
    }
}