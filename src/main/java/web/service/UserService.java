package web.service;

import web.model.User;
import java.util.List;

public interface UserService {
    List<User> getAllUsers();


    void saveUser(User user);

    void removeUser(int id);

    void changeUser(User updateUser);

    User getUserByID(int id);
}