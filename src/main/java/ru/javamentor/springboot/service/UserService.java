package ru.javamentor.springboot.service;

import ru.javamentor.springboot.model.User;
import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void saveUser(User user);
    User removeUserById(long id);
    void updateUser(User user);
}