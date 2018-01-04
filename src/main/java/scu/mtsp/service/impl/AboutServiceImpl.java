package scu.mtsp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import scu.mtsp.dao.AboutDao;
import scu.mtsp.domain.About;
import scu.mtsp.service.AboutService;

import java.util.List;

/**
 * Created by zhc on 2017/12/26
 */
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("aboutService")
public class AboutServiceImpl implements AboutService{

    @Autowired
    private AboutDao aboutDao;

    public void addAbout(About about) {
        aboutDao.insertAbout(about);
    }

    public void deleteAboutById(Integer aboutId) {
        aboutDao.deleteAboutById(aboutId);
    }

    public List<About> selectAboutWithParams(About about) {
        return aboutDao.selectAboutWithParams(about);
    }

    public void updateAbout(About about) {
        aboutDao.updateAbout(about);
    }
}
