package ru.javamentor.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.javamentor.springboot.dao.UserDao;
import ru.javamentor.springboot.model.User;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    public void saveUser(User user) {
        this.userDao.saveUser(user);
    }

    @Transactional
    public User removeUserById(long id) {
        this.userDao.removeUserById(id);
        return null;
    }

    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return this.userDao.getAllUsers();
    }

    private final List<User> users = new ArrayList<>();

    public UserServiceImp() {
    }

    @Transactional
    public void updateUser(User user) {
        userDao.updateUser(user);
    }
}