package dao;

import model.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * @author Gaziz Bakyt
 */
@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public void editUser(User user) {
        manager.merge(user);
    }

    @Override
    public List<User> allUsers() {
        return manager.createQuery("select u from User u", User.class).getResultList();
    }

    @Override
    public void save(User user) {
        manager.persist(user);
    }

    @Override
    public void delete(User user) {
        manager.remove(user);
    }


    @Override
    public User getUserById(Long id) {
        return manager.find(User.class, id);
    }
}
