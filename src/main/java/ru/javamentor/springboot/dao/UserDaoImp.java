package ru.javamentor.springboot.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ru.javamentor.springboot.model.User;
import java.util.List;
import java.util.logging.Logger;

@Repository
public class UserDaoImp implements UserDao {

    private static final Logger logger = Logger.getLogger(UserDaoImp.class.getName());

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveUser(User user) {
        entityManager.persist(user);
        logger.info("Пользователь успешно сохранён.");
    }

    @Override
    public void removeUserById(long id) {
        User user = entityManager.find(User.class, id);
        if (user != null) {
            entityManager.remove(user);
            logger.info("Пользователь с id=" + id + " успешно удалён.");
        } else {
            logger.warning("Пользователь с id=" + id + " не найден.");
        }
    }

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    @Override
    public void updateUser(User user) {
        entityManager.merge(user); // Обновление существующей записи
        logger.info("Пользователь успешно обновлён.");
    }
}