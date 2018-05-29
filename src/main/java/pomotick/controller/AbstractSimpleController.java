package pomotick.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.*;
import pomotick.exceptions.ApplicationException;
import pomotick.services.daoservices.DaoService;

public abstract class AbstractSimpleController<T, P extends CrudRepository<T, Long>, RS extends DaoService<T, P>> {
    private RS restService;

    AbstractSimpleController(RS restService) {
        this.restService = restService;
    }

    @GetMapping("/{id}")
    public T getById(@PathVariable Long id) throws ApplicationException {
        return this.restService.getById(id);
    }

    @GetMapping
    public Iterable<T> getAll() throws ApplicationException {
        return this.restService.getAll();
    }

    @PostMapping
    public T post(@RequestBody T obj) throws ApplicationException {
        return this.restService.save(obj);
    }
}
