package pomotick.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pomotick.model.routine.Routine;

@Repository
public interface RoutineRepository extends CrudRepository<Routine, Long> {
}
