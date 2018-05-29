package pomotick.services.daoservices.simpledaoservices;

import org.springframework.stereotype.Service;
import pomotick.model.tasksmanagement.TasksStorage;
import pomotick.repository.TasksStorageRepository;
import pomotick.services.daoservices.DaoService;

@Service
public class TaskStorageDaoService extends DaoService<TasksStorage, TasksStorageRepository> {
    public TaskStorageDaoService(TasksStorageRepository repository) {
        super(repository);
    }
}
