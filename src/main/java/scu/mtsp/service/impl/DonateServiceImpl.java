package scu.mtsp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import scu.mtsp.dao.DonateDao;
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
    private DonateDao donateDao;

    public void addDonate(Donate donate) {
        donateDao.insertDonate(donate);
    }

    public void deleteDonateById(Integer donateId) {
        donateDao.deleteDonateById(donateId);
    }

    public List<Donate> findDonateWithParams(Donate donate) {
        return donateDao.selectDonateWithParams(donate);
    }

    public void modifyDonate(Donate donate) {
        donateDao.updateDonate(donate);
    }
}
