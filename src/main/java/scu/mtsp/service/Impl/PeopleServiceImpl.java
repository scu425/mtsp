package scu.mtsp.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import scu.mtsp.dao.PeopleDAO;
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
    private PeopleDAO peopleDAO;

    @Override
    public void addPeople(People people) {
        peopleDAO.insertPeople(people);
    }

    @Override
    public void deletePeopleById(Integer poepleId) {
        peopleDAO.deletePeopleById(poepleId);
    }

    @Override
    public List<People> findPeopleWithParams(People people) {
        return peopleDAO.selectPeopleWithParams(people);
    }

    @Override
    public void modifyPeople(People people) {
        peopleDAO.updatePeople(people);
    }
}
