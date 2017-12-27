package scu.mtsp.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import scu.mtsp.dao.AboutDAO;
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
    private AboutDAO aboutDAO;

    @Override
    public void addAbout(About about) {
        aboutDAO.insertAbout(about);
    }

    @Override
    public void deleteAboutById(Integer aboutId) {
        aboutDAO.deleteAboutById(aboutId);
    }

    @Override
    public List<About> selectAboutWiathParams(About about) {
        return aboutDAO.selectAboutWithParams(about);
    }

    @Override
    public void updateAbout(About about) {
        aboutDAO.updateAbout(about);
    }
}
