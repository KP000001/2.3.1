package dao;

import model.User;

import java.util.List;

/**
 * @author Gaziz Bakyt
 */
public interface UserDao {
    void editUser(User user);
    List<User> allUsers();
    void save(User user);
    void delete(User user);
    User getUserById(Long id);
}
