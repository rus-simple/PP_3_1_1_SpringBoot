package ru.javamentor.springboot.dao;
import ru.javamentor.springboot.model.User;
import java.util.List;

public interface UserDao {
    void saveUser(User user);
    void removeUserById(long id);
    List<User> getAllUsers();
    void updateUser(User user);
}
