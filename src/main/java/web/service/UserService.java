package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);
    User getUser(long id);
    void deleteUser(long id);
    void updateUser(User user);
    List<User> getAllUsers();
}
