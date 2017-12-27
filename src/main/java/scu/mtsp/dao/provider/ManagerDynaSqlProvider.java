package scu.mtsp.dao.provider;

import org.apache.ibatis.jdbc.SQL;
import scu.mtsp.domain.Manager;

import static scu.mtsp.constant.MTSPConstant.MANAGER;

/**
 * Created by zhc on 2017/12/26
 */
public class ManagerDynaSqlProvider {
    /**
     * 插入管理员
     *
     * @param manager
     * @return
     */
    public String insertManager(Manager manager) {
        return new SQL() {
            {
                INSERT_INTO(MANAGER);
                if (manager.getLoginname() != null && !manager.getLoginname().equals("")) {
                    VALUES("loginname", "#{loginname}");
                }
                if (manager.getUsername() != null && !manager.getUsername().equals("")) {
                    VALUES("username", "#{username}");
                }
                if (manager.getPassword() != null && !manager.getPassword().equals("")) {
                    VALUES("password", "#{password}");
                }
            }
        }.toString();
    }

    /**
     * 更新管理员用户
     *
     * @param manager
     * @return
     */
    public String updateManager(Manager manager) {
        return new SQL() {
            {
                UPDATE(MANAGER);
                WHERE("manager_id = #{managerId}");
                if (manager.getLoginname() != null && !manager.getLoginname().equals("")) {
                    SET("loginname = #{loginname}");
                }
                if (manager.getUsername() != null && !manager.getUsername().equals("")) {
                    SET("username = #{username}");
                }
                if (manager.getPassword() != null && !manager.getPassword().equals("")) {
                    VALUES("password", "#{password}");
                }
            }
        }.toString();
    }

    /**
     * 根据条件查询管理员
     *
     * @param manager
     * @return
     */
    public String selectManagerWithParams(Manager manager) {
        return new SQL() {
            {
                SELECT("*");
                FROM(MANAGER);
                if (manager.getManagerId() != null && !manager.getManagerId().equals("")) {
                    WHERE("manager_id = #{managerId}");
                }
                if (manager.getLoginname() != null && !manager.getLoginname().equals("")) {
                    WHERE("loginname = #{loginname}");
                }
                if (manager.getUsername() != null && !manager.getUsername().equals("")) {
                    WHERE("username like concat ('%',#{username},'%' )");
                }
            }
        }.toString();
    }
}
