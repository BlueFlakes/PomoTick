package pomotick.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pomotick.model.tasksmanagement.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {
}
