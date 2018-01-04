package scu.mtsp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import scu.mtsp.dao.PeopleDao;
import scu.mtsp.domain.People;
import scu.mtsp.service.PeopleService;

import java.util.List;

/**
 * Created by zhc on 2017/12/26
 */
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("peopleService")
public class PeopleServiceImpl implements PeopleService{

    @Autowired
    private PeopleDao peopleDao;

    public void addPeople(People people) {
        peopleDao.insertPeople(people);
    }

    public void deletePeopleById(Integer poepleId) {
        peopleDao.deletePeopleById(poepleId);
    }

    public List<People> findPeopleWithParams(People people) {
        return peopleDao.selectPeopleWithParams(people);
    }

    public void modifyPeople(People people) {
        peopleDao.updatePeople(people);
    }
}
