package scu.mtsp.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import scu.mtsp.dao.UserDAO;
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
    private UserDAO userDAO;

    @Override
    public User login(String loginname, String email, String password) {
        return userDAO.login(loginname, email, password);
    }

    @Override
    public void addUser(User user) {
        userDAO.insertUser(user);
    }

    @Override
    public void deleteUserById(Integer userId) {
        userDAO.deleteUserById(userId);
    }

    @Override
    public List<User> findUserWithParams(User user) {
        return userDAO.selectUserWithParams(user);
    }

    @Override
    public void modifyUser(User user) {
        userDAO.updateUser(user);
    }
}
