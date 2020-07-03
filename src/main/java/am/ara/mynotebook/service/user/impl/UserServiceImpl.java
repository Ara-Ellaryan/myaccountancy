package am.ara.mynotebook.service.user.impl;

import am.ara.mynotebook.entity.user.UserEntity;
import am.ara.mynotebook.exception.DataBaseException;
import am.ara.mynotebook.repository.user.UserRepo;
import am.ara.mynotebook.service.user.UserService;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

@Component
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;

    private final LoadingCache<String, UserEntity> userCache;

    @Autowired
    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
        this.userCache = CacheBuilder
                .newBuilder()
                .expireAfterAccess(30, TimeUnit.MINUTES)
                .build(new CacheLoader<String, UserEntity>() {
                    @Override
                    public UserEntity load(String key) throws Exception {
                        return UserServiceImpl.this.userRepo.findById(1).get();
                    }
                });
    }


    @Override
    public UserEntity add(UserEntity user, InputStream imageContent) {
        return null;
    }

    @Override
    public UserEntity add(UserEntity user) throws DataBaseException {
        return this.userRepo.save(user);
    }

    @Override
    public UserEntity update(UserEntity user) throws DataBaseException {
        return this.userRepo.save(user);
    }

    @Override
    public Optional<UserEntity> getUser() throws DataBaseException, ExecutionException {
        UserEntity user = this.userCache.get(1 + "");
        if (user == null) {
            user = this.userRepo.findById(1).orElse(null);
            if (user != null) {
                this.userCache.put(1 + "", user);
            }
        }
        return Optional.ofNullable(user);
    }

    @Override
    public boolean userExist(String email) throws DataBaseException {
        return this.userRepo.findByMainMail(email);
    }

    @Override
    public void deleteUser(int id) throws DataBaseException {
        this.userRepo.deleteById(id);
        this.userCache.invalidate(1 + "");
    }
}