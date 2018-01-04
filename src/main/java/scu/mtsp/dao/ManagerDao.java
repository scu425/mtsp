package scu.mtsp.dao;

import scu.mtsp.dao.provider.ManagerDynaSqlProvider;
import scu.mtsp.domain.Manager;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

import static scu.mtsp.util.common.MtspConstant.MANAGERTABLE;

/**
 * Created by imqsl on 2017/9/8.
 */
public interface ManagerDao {

    //根据用户名和密码来查询管理员
    @Select("select * from " + MANAGERTABLE + " where name=#{name} and password=#{password}")
    Manager selectByNameAndPassword(@Param("name") String name, @Param("password") String password);

    //根据id查询管理员
    @Select("select * from " + MANAGERTABLE + " where id=#{id}")
    Manager selectById(Integer id);

    //增加管理员
    @SelectProvider(type = ManagerDynaSqlProvider.class, method = "insertWithParams")
    void insert(Manager manager);

    //删除管理员
    @Delete("delete from " + MANAGERTABLE + " where id=#{id}")
    void deleteById(Integer id);

    //动态更新管理员信息
    @SelectProvider(type = ManagerDynaSqlProvider.class, method = "updateWithParams")
    void update(Manager manager);

    //动态查询管理员信息
    @SelectProvider(type = ManagerDynaSqlProvider.class, method = "selectWithParams")
    List<Manager> selectWithParams(Manager manager);

}
