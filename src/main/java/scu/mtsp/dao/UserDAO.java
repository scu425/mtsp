package scu.mtsp.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import scu.mtsp.dao.provider.UserDynaSqlProvider;
import scu.mtsp.domain.User;

import java.util.List;

import static scu.mtsp.constant.MTSPConstant.USER;

/**
 * Created by zhc on 2017/12/25
 */
public interface UserDAO {

    /**
     * 根据登录名或者邮箱和密码登陆
     *
     * @param loginname
     * @param email
     * @param password
     * @return
     */
    @Select("select * from " + USER + " where (loginname = #{loginname} or email = #{email}) " +
            " and password = #{password} ")
    User login(@Param("loginname") String loginname, @Param("email") String email,
               @Param("password") String password);

    /**
     * 添加用户
     *
     * @param user
     */
    @SelectProvider(type = UserDynaSqlProvider.class, method = "insertUser")
    void insertUser(User user);

    /**
     * 根绝id删除用户
     *
     * @param userId
     */
    @Delete("delete from " + USER + " where user_id = #{userId}")
    void deleteUserById(@Param("userId") Integer userId);

    /**
     * 修改用户信息
     *
     * @param user
     * @return
     */
    @SelectProvider(type = UserDynaSqlProvider.class, method = "updateUser")
    User updateUser(User user);

    /**
     * 根绝条件查询用户
     *
     * @param user
     * @return
     */
    @SelectProvider(type = UserDynaSqlProvider.class, method = "selectUserWithParams")
    List<User> selectUserWithParams(User user);
}
