package pomotick.services.daoservices.simpledaoservices;

import org.springframework.stereotype.Service;
import pomotick.model.UserProfile;
import pomotick.repository.UserProfileRepository;
import pomotick.services.daoservices.DaoService;

@Service
public class UserProfileDaoService extends DaoService<UserProfile, UserProfileRepository> {
    public UserProfileDaoService(UserProfileRepository repository) {
        super(repository);
    }
}
