package pomotick.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pomotick.model.tasksmanagement.Task;
import pomotick.repository.TaskRepository;
import pomotick.services.daoservices.simpledaoservices.TaskDaoService;

@RestController
@RequestMapping("/tasks")
public class TaskController extends AbstractSimpleController<Task, TaskRepository, TaskDaoService> {
    public TaskController(TaskDaoService restService) {
        super(restService);
    }
}
