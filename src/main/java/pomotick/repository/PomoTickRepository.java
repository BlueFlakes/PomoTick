package pomotick.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pomotick.model.tasksmanagement.PomoTick;

@Repository
public interface PomoTickRepository extends CrudRepository<PomoTick, Long> {
}
