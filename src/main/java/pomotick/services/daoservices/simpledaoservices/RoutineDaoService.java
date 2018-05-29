package pomotick.services.daoservices.simpledaoservices;

import org.springframework.stereotype.Service;
import pomotick.model.routine.Routine;
import pomotick.repository.RoutineRepository;
import pomotick.services.daoservices.DaoService;

@Service
public class RoutineDaoService extends DaoService<Routine, RoutineRepository> {
    public RoutineDaoService(RoutineRepository repository) {
        super(repository);
    }
}
