package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import web.dao.UserDao;
import web.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Gaziz Bakyt
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void updateUser(Long id, User user) {
        userDao.updateUser(id, user);
    }

    @Override
    public List<User> allUsers() {
        return userDao.allUsers();
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userDao.deleteUserById(id);
    }

    @Override
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }
}
