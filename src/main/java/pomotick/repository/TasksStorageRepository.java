package pomotick.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pomotick.model.tasksmanagement.TasksStorage;

@Repository
public interface TasksStorageRepository extends CrudRepository<TasksStorage, Long> {
}
