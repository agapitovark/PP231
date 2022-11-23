package web.service;

import org.springframework.stereotype.Service;
import web.Dao.UserDao;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public void saveUser(User user) {

        userDao.saveUser(user);
    }

    @Override
    public void removeUser(int id) {
        userDao.removeUser(id);
    }

    @Override
    public void changeUser(User updateUser) {
        userDao.changeUser(updateUser);
    }

    @Override
    public User getUserByID(int id) {
        return userDao.getUserByID(id);
    }

}

