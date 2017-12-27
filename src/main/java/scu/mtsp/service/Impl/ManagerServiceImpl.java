package scu.mtsp.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import scu.mtsp.dao.ManagerDAO;
import scu.mtsp.domain.Manager;
import scu.mtsp.service.ManagerService;

import java.util.List;

/**
 * Created by zhc on 2017/12/26
 */
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("managerService")
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private ManagerDAO managerDAO;

    @Override
    public Manager login(String loginname, String password) {
        return managerDAO.login(loginname, password);
    }

    @Override
    public void addManager(Manager manager) {
        managerDAO.insertManager(manager);
    }

    @Override
    public void deleteManagerById(Integer managerId) {
        managerDAO.deleteManagerById(managerId);
    }

    @Override
    public List<Manager> findManagerWithParams(Manager manager) {
        return managerDAO.selectManagerWithParams(manager);
    }

    @Override
    public void modifyManager(Manager manager) {
        managerDAO.updateManager(manager);
    }
}
