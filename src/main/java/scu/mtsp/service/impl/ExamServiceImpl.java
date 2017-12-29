package scu.mtsp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scu.mtsp.dao.ExamDao;
import scu.mtsp.domain.Exam;
import scu.mtsp.service.ExamService;

import java.util.List;

/**
 * Created by imqsl on 2017-12-28.
 */
@Service
public class ExamServiceImpl implements ExamService{

    @Autowired
    ExamDao examDao;

    /**
     *description:添加试题并且上传试题文件与答案
     */
    public void save(Exam exam) {
        examDao.save(exam);
    }

    public void delete(Integer id) {
        examDao.delete(id);
    }

    public void update(Exam exam) {
        examDao.update(exam);
    }

    public List<Exam> selectWithParams(Exam exam) {
        return examDao.selectWithParams(exam);
    }

    public Exam selectById(Integer id) {
        return examDao.selectById(id);
    }

    public Exam selectByWhichPlanAndRound(String whichPlan, String round) {
        return examDao.selectByWhichPlanAndRound(whichPlan,round);
    }
}
