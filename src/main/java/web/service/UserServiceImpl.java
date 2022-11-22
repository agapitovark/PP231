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
    public void saveUser(String name, String lastName, byte age) {
        userDao.saveUser(name, lastName, age);
    }

    @Override
    public void removeUser(int id) {
        userDao.removeUser(id);
    }

    @Override
    public User changeUser(int id, String name, String lastName, byte age) {
        return userDao.changeUser(id, name, lastName, age);
    }

    @Override
    public User getUserByID(int id) {
        return userDao.getUserByID(id);
    }

}

