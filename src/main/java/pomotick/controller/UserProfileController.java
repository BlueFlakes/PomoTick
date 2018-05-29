package pomotick.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pomotick.repository.UserProfileRepository;
import pomotick.model.UserProfile;
import pomotick.services.daoservices.simpledaoservices.UserProfileDaoService;

@RestController
@RequestMapping("/userprofiles")
public class UserProfileController extends AbstractSimpleController<UserProfile,
                                                                    UserProfileRepository,
                                                                    UserProfileDaoService> {
    public UserProfileController(UserProfileDaoService restService) {
        super(restService);
    }
}
