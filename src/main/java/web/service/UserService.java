package web.service;

import web.model.User;
import java.util.List;

public interface UserService {
    List<User> getAllUsers();


    void saveUser(User user);

    void removeUser(int id);

    public void changeUser(User updateUser);

    public User getUserByID(int id);
}