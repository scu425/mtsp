package scu.mtsp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import scu.mtsp.dao.UserDao;
import scu.mtsp.domain.User;
import scu.mtsp.service.UserService;

import java.util.List;

/**
 * Created by zhc on 2017/12/26
 */
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User login(String loginname, String email, String password) {
        return userDao.login(loginname, email, password);
    }

    public void addUser(User user) {
        userDao.insertUser(user);
    }

    public void deleteUserById(Integer userId) {
        userDao.deleteUserById(userId);
    }

    public List<User> findUserWithParams(User user) {
        return userDao.selectUserWithParams(user);
    }

    public void modifyUser(User user) {
        userDao.updateUser(user);
    }
}
