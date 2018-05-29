package pomotick.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pomotick.model.tasksmanagement.PomoTick;
import pomotick.repository.PomoTickRepository;
import pomotick.services.daoservices.simpledaoservices.PomoTickDaoService;

@RestController
@RequestMapping("/pomoticks")
public class PomoTickController extends AbstractSimpleController<PomoTick, PomoTickRepository, PomoTickDaoService> {
    public PomoTickController(PomoTickDaoService restService) {
        super(restService);
    }
}
