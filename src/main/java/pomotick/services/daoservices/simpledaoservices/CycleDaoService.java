package pomotick.services.daoservices.simpledaoservices;

import org.springframework.stereotype.Service;
import pomotick.exceptions.ApplicationException;
import pomotick.model.routine.Cycle;
import pomotick.repository.CycleRepository;
import pomotick.services.daoservices.DaoService;

@Service
public class CycleDaoService extends DaoService<Cycle, CycleRepository> {
    public CycleDaoService(CycleRepository repository) {
        super(repository);
    }

    @Override
    public Cycle save(Cycle obj) throws ApplicationException {
        return super.save(obj);
    }
}
