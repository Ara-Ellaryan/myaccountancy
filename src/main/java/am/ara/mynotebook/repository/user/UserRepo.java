package am.ara.mynotebook.repository.user;

import am.ara.mynotebook.entity.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, Integer> {

}
