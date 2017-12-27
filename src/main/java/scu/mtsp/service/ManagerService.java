package scu.mtsp.service;

import scu.mtsp.domain.Manager;

import java.util.List;

/**
 * Created by zhc on 2017/12/26
 */
public interface ManagerService {
    /**
     * 管理员登陆
     *
     * @param loginname
     * @param password
     * @return
     */
    Manager login(String loginname, String password);

    /**
     * 添加管理员
     *
     * @param manager
     */
    void addManager(Manager manager);

    /**
     * 删除管理员
     *
     * @param managerId
     */
    void deleteManagerById(Integer managerId);

    /**
     * 根据条件查询管理员
     *
     * @param manager
     * @return
     */
    List<Manager> findManagerWithParams(Manager manager);

    /**
     * 修改管理员信息
     * @param manager
     */
    void modifyManager(Manager manager);
}
