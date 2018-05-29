package pomotick.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pomotick.model.UserProfile;

@Repository
public interface UserProfileRepository extends CrudRepository<UserProfile, Long> {
}
