package web.Dao;


import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();


    void saveUser(User user);

    void removeUser(int id);

    void changeUser(int id, User updateUser);

    public User getUserByID(int id);
}

