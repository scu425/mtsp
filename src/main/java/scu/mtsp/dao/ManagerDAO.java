package scu.mtsp.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import scu.mtsp.dao.provider.ManagerDynaSqlProvider;
import scu.mtsp.domain.Manager;

import java.util.List;

import static scu.mtsp.constant.MTSPConstant.MANAGER;

/**
 * Created by zhc on 2017/12/25
 */
public interface ManagerDAO {
    /**
     * 管理员登陆
     *
     * @param loginname
     * @param password
     * @return
     */
    @Select("select * from " + MANAGER + " where loginname = #{loginname} and password = #{password}")
    Manager login(@Param("loginname") String loginname, @Param("password") String password);

    /**
     * 插入管理员
     *
     * @param manager
     */
    @SelectProvider(type = ManagerDynaSqlProvider.class, method = "insertManager")
    void insertManager(Manager manager);

    /**
     * 删除管理员
     *
     * @param managerId
     */
    @Delete("delete from " + MANAGER + " where manager_id = managerId")
    void deleteManagerById(@Param("managerId") Integer managerId);

    /**
     * 根据条件查询管理员
     *
     * @param manager
     * @return
     */
    @SelectProvider(type = ManagerDynaSqlProvider.class, method = "selectManagerWithParams")
    List<Manager> selectManagerWithParams(Manager manager);

    /**
     * 更新管理员信息
     *
     * @param manager
     */
    @SelectProvider(type = ManagerDynaSqlProvider.class, method = "updateManager")
    void updateManager(Manager manager);
}
