package web.dao;

import web.model.User;

import java.util.List;

/**
 * @author Gaziz Bakyt
 */
public interface UserDao {
    void updateUser(Long id, User user);

    List<User> allUsers();

    void save(User user);

    void deleteUserById(Long id);

    User getUserById(Long id);
}
