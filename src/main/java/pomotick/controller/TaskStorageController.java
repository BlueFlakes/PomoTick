package pomotick.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pomotick.model.tasksmanagement.TasksStorage;
import pomotick.repository.TasksStorageRepository;
import pomotick.services.daoservices.simpledaoservices.TaskStorageDaoService;

@RestController
@RequestMapping("/taskstorages")
public class TaskStorageController extends AbstractSimpleController<TasksStorage, TasksStorageRepository, TaskStorageDaoService> {
    public TaskStorageController(TaskStorageDaoService restService) {
        super(restService);
    }
}
