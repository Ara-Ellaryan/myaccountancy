package am.ara.mynotebook.service.user;

import am.ara.mynotebook.entity.user.UserEntity;
import am.ara.mynotebook.exception.DataBaseException;

import java.io.InputStream;
import java.util.Optional;
import java.util.concurrent.ExecutionException;

public interface UserService {

    UserEntity add(UserEntity user, InputStream imageContent);

    UserEntity add(UserEntity user) throws DataBaseException;

    UserEntity update(UserEntity user) throws DataBaseException;

    Optional<UserEntity> getUser() throws DataBaseException, ExecutionException;

    boolean userExist(String email) throws DataBaseException;

    void deleteUser(int id) throws DataBaseException;
}
