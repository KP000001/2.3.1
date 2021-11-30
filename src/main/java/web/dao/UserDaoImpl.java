package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * @author Gaziz Bakyt
 */
@Service
@Component
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public void save(User user) {
        manager.persist(user);
    }

    @Override
    public void updateUser(Long id, User user) {
        User userToBeUpdated = getUserById(id);
        userToBeUpdated.setName(user.getName());
        userToBeUpdated.setLastName(user.getLastName());
        userToBeUpdated.setAge(user.getAge());
    }

    @Override
    public List<User> allUsers() {
        return manager.createQuery("select u from User u", User.class).getResultList();
    }


    @Override
    public void deleteUserById(Long id) {
        manager.remove(getUserById(id));
    }

    @Override
    public User getUserById(Long id) {
        return manager.find(User.class, id);
    }
}
