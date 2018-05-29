package pomotick.services.daoservices.simpledaoservices;

import org.springframework.stereotype.Service;
import pomotick.model.tasksmanagement.Task;
import pomotick.repository.TaskRepository;
import pomotick.services.daoservices.DaoService;

@Service
public class TaskDaoService extends DaoService<Task, TaskRepository> {
    public TaskDaoService(TaskRepository repository) {
        super(repository);
    }
}
