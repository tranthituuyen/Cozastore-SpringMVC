package vn.edu.nlu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.nlu.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findOneByUsernameAndStatus(String name, boolean status);
}
