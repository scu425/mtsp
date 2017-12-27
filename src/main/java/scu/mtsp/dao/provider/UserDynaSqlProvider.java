package scu.mtsp.dao.provider;

import org.apache.ibatis.jdbc.SQL;
import scu.mtsp.domain.User;

import static scu.mtsp.constant.MTSPConstant.USER;

/**
 * Created by zhc on 2017/12/25
 */
public class UserDynaSqlProvider {
    /**
     * 插入用户
     *
     * @param user
     * @return
     */
    public String insertUser(User user) {
        return new SQL() {
            {
                INSERT_INTO(USER);
                if (user.getLoginname() != null && !user.getLoginname().equals("")) {
                    VALUES("loginname", "#{user.loginname}");
                }
                if (user.getUsername() != null && !user.getUsername().equals("")) {
                    VALUES("username", "#{user.username}");
                }
                if (user.getPassword() != null && !user.getPassword().equals("")) {
                    VALUES("password", "#{user.password}");
                }
                if (user.getAge() != null && !user.getAge().equals("")) {
                    VALUES("age", "#{user.age}");
                }
                if (user.getGender() != null && !user.getGender().equals("")) {
                    VALUES("gender", "#{user.gender}");
                }
                if (user.getGrade() != null && !user.getGrade().equals("")) {
                    VALUES("grade", "#{user.grade}");
                }
                if (user.getSchool() != null && !user.getSchool().equals("")) {
                    VALUES("school", "#{user.school}");
                }
                if (user.getEmail() != null && !user.getEmail().equals("")) {
                    VALUES("email", "#{email}");
                }
            }
        }.toString();
    }

    /**
     * 更新用户
     *
     * @param user
     * @return
     */
    public String updateUser(User user) {
        return new SQL() {
            {
                UPDATE(USER);
                WHERE("user_id = #{user.userId}");
                if (user.getLoginname() != null && !user.getLoginname().equals("")) {
                    SET("loginname  = #{user.loginname}");
                }
                if (user.getUsername() != null && !user.getUsername().equals("")) {
                    SET("username = #{user.username}");
                }
                if (user.getPassword() != null && !user.getPassword().equals("")) {
                    SET("password = #{user.password}");
                }
                if (user.getAge() != null && !user.getAge().equals("")) {
                    SET("age = #{user.age}");
                }
                if (user.getGender() != null && !user.getGender().equals("")) {
                    SET("gender = #{user.gender}");
                }
                if (user.getGrade() != null && !user.getGrade().equals("")) {
                    SET("grade = #{user.grade}");
                }
                if (user.getSchool() != null && !user.getSchool().equals("")) {
                    SET("school = #{user.school}");
                }
                if (user.getEmail() != null && !user.getEmail().equals("")) {
                    SET("email = #{user.email}");
                }
            }
        }.toString();
    }

    /**
     * 根绝条件选择用户
     *
     * @param user
     * @return
     */
    public String selectUserWithParams(User user) {
        return new SQL() {
            {
                SELECT("*");
                FROM(USER);
                if (user.getUserId() != null && !user.getUserId().equals("")) {
                    WHERE("user_id = #{user.userId}");
                }
                if (user.getLoginname() != null && !user.getLoginname().equals("")) {
                    WHERE("loginname like concat ('%',#{user.loginname},'%')");
                }
                if (user.getUsername() != null && !user.getUsername().equals("")) {
                    WHERE("username like concat ('%',#{user.username},'%')");
                }
                if (user.getAge() != null && !user.getAge().equals("")) {
                    WHERE("age = #{user.age}");
                }
                if (user.getGender() != null && !user.getGender().equals("")) {
                    WHERE("gender = #{user.gender}");
                }
                if (user.getGrade() != null && !user.getGrade().equals("")) {
                    WHERE("grade = #{user.grade}");
                }
                if (user.getSchool() != null && !user.getSchool().equals("")) {
                    WHERE("school = #{user.school}");
                }
                if (user.getEmail() != null && !user.getEmail().equals("")) {
                    WHERE("email = #{user.email}");
                }
            }
        }.toString();
    }
}
