package scu.mtsp.dao.provider;

import org.apache.ibatis.jdbc.SQL;
import scu.mtsp.domain.User;

import static scu.mtsp.util.common.MtspConstant.USER;

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
    public String insertUser(final User user) {
        return new SQL() {
            {
                INSERT_INTO(USER);
                if (user.getLoginname() != null && !user.getLoginname().equals("")) {
                    VALUES("loginname", "#{loginname}");
                }
                if (user.getUsername() != null && !user.getUsername().equals("")) {
                    VALUES("username", "#{username}");
                }
                if (user.getPassword() != null && !user.getPassword().equals("")) {
                    VALUES("password", "#{password}");
                }
                if (user.getAge() != null && !user.getAge().equals("")) {
                    VALUES("age", "#{age}");
                }
                if (user.getGender() != null && !user.getGender().equals("")) {
                    VALUES("gender", "#{gender}");
                }
                if (user.getGrade() != null && !user.getGrade().equals("")) {
                    VALUES("grade", "#{grade}");
                }
                if (user.getSchool() != null && !user.getSchool().equals("")) {
                    VALUES("school", "#{school}");
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
    public String updateUser(final User user) {
        return new SQL() {
            {
                UPDATE(USER);
                WHERE("user_id = #{userId}");
                if (user.getLoginname() != null && !user.getLoginname().equals("")) {
                    SET("loginname  = #{loginname}");
                }
                if (user.getUsername() != null && !user.getUsername().equals("")) {
                    SET("username = #{username}");
                }
                if (user.getPassword() != null && !user.getPassword().equals("")) {
                    SET("password = #{password}");
                }
                if (user.getAge() != null && !user.getAge().equals("")) {
                    SET("age = #{age}");
                }
                if (user.getGender() != null && !user.getGender().equals("")) {
                    SET("gender = #{gender}");
                }
                if (user.getGrade() != null && !user.getGrade().equals("")) {
                    SET("grade = #{grade}");
                }
                if (user.getSchool() != null && !user.getSchool().equals("")) {
                    SET("school = #{school}");
                }
                if (user.getEmail() != null && !user.getEmail().equals("")) {
                    SET("email = #{email}");
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
    public String selectUserWithParams(final User user) {
        return new SQL() {
            {
                SELECT("*");
                FROM(USER);
                if (user.getUserId() != null && !user.getUserId().equals("")) {
                    WHERE("user_id = #{userId}");
                }
                if (user.getLoginname() != null && !user.getLoginname().equals("")) {
                    WHERE("loginname like concat ('%',#{loginname},'%')");
                }
                if (user.getUsername() != null && !user.getUsername().equals("")) {
                    WHERE("username like concat ('%',#{username},'%')");
                }
                if (user.getAge() != null && !user.getAge().equals("")) {
                    WHERE("age = #{age}");
                }
                if (user.getGender() != null && !user.getGender().equals("")) {
                    WHERE("gender = #{gender}");
                }
                if (user.getGrade() != null && !user.getGrade().equals("")) {
                    WHERE("grade = #{grade}");
                }
                if (user.getSchool() != null && !user.getSchool().equals("")) {
                    WHERE("school = #{school}");
                }
                if (user.getEmail() != null && !user.getEmail().equals("")) {
                    WHERE("email = #{email}");
                }
            }
        }.toString();
    }
}
