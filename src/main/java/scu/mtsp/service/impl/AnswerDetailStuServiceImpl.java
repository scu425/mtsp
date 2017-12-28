package scu.mtsp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scu.mtsp.dao.AnswerDetailStuDao;
import scu.mtsp.domain.AnswerDetailStu;
import scu.mtsp.service.AnswerDetailStuService;

import java.util.List;

/**
 * Created by imqsl on 2017-12-28.
 */

@Service
public class AnswerDetailStuServiceImpl implements AnswerDetailStuService {
   @Autowired
    AnswerDetailStuDao answerDetailStuDao;
    public void save(AnswerDetailStu answerDetailStu) {
        answerDetailStuDao.save(answerDetailStu);
    }

    public void delete(Integer id) {
        answerDetailStuDao.delete(id);
    }

    public void update(AnswerDetailStu answerDetailStu) {
        answerDetailStuDao.update(answerDetailStu);
    }

    public List<AnswerDetailStu> selectWithParams(AnswerDetailStu answerDetailStu) {
        return answerDetailStuDao.selectWithParams(answerDetailStu);
    }

    public AnswerDetailStu selectById(Integer id) {
        return answerDetailStuDao.selectById(id);
    }
}
