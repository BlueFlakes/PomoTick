package pomotick.services.daoservices.simpledaoservices;

import org.springframework.stereotype.Service;
import pomotick.model.tasksmanagement.PomoTick;
import pomotick.repository.PomoTickRepository;
import pomotick.services.daoservices.DaoService;

@Service
public class PomoTickDaoService extends DaoService<PomoTick, PomoTickRepository> {
    public PomoTickDaoService(PomoTickRepository repository) {
        super(repository);
    }
}
