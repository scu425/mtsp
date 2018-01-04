package scu.mtsp.service;

import scu.mtsp.domain.User;

import java.util.List;

/**
 * Created by zhc on 2017/12/26
 */
public interface UserService {
    /**
     * 邮箱或登录名 进行登陆
     * @param loginname
     * @param email
     * @param password
     * @return
     */
    User login(String loginname, String email, String password);

    /**
     * 增加用户
     * @param user
     */
    void addUser(User user);

    /**
     * 根绝id删除
     * @param userId
     */
    void deleteUserById(Integer userId);

    /**
     * 根据条件查询
     * @param user
     * @return
     */
    List<User> findUserWithParams(User user);

    /**
     * 修改用户信息
     * @param user
     */
    void modifyUser(User user);
}
