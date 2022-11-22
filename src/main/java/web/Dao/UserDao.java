package web.Dao;


import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();


    void saveUser(String name, String lastName, byte age);

    void removeUser(int id);

    User changeUser (int id, String name, String lastName, byte age);

    public User getUserByID(int id);
}

