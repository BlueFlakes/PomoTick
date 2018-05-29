package pomotick.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pomotick.model.routine.Cycle;

@Repository
public interface CycleRepository extends CrudRepository<Cycle, Long> {
}
