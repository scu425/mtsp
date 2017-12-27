package scu.mtsp.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import scu.mtsp.dao.DonateDAO;
import scu.mtsp.domain.Donate;
import scu.mtsp.service.DonateService;

import java.util.List;

/**
 * Created by zhc on 2017/12/26
 */
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("donateService")
public class DonateServiceImpl implements DonateService{
    @Autowired
    private DonateDAO donateDAO;

    @Override
    public void addDonate(Donate donate) {
        donateDAO.insertDonate(donate);
    }

    @Override
    public void deleteDonateById(Integer donateId) {
        donateDAO.deleteDonateById(donateId);
    }

    @Override
    public List<Donate> findDonateWithParams(Donate donate) {
        return donateDAO.selectDonateWithParams(donate);
    }

    @Override
    public void modifyDonate(Donate donate) {
        donateDAO.updateDonate(donate);
    }
}
