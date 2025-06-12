package ru.javamentor.springboot.dao;
import ru.javamentor.springboot.model.User;
import java.util.List;

public interface UserDao {
    void saveUser(User user);
    void createUsersTable();
    void dropUsersTable();
    void removeUserById(long id);
    List<User> getAllUsers();
    void cleanUsersTable();
    User getUserById(long id);
    void updateUser(User user);
}
