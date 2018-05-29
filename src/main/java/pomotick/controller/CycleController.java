package pomotick.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pomotick.model.routine.Cycle;
import pomotick.repository.CycleRepository;
import pomotick.services.daoservices.simpledaoservices.CycleDaoService;

@RestController
@RequestMapping("/cycles")
public class CycleController extends AbstractSimpleController<Cycle, CycleRepository, CycleDaoService> {
    public CycleController(CycleDaoService restService) {
        super(restService);
    }
}
