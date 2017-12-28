package scu.mtsp.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import scu.mtsp.domain.Exam;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by imqsl on 2017-12-28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class ExamDaoTest {
    @Autowired
    ExamDao examDao;
    @Test
    public void save() throws Exception {
        examDao.save(new Exam("a","1","a b c d",new Date()));
    }

    @Test
    public void delete() throws Exception {
        examDao.delete(2);
    }

    @Test
    public void update() throws Exception {
        Exam exam=new Exam();
        exam.setId(1);
        exam.setRound("2");
        examDao.update(exam);
    }

    @Test
    public void selectAll() throws Exception {
        List<Exam> examList=examDao.selectAll();
        for (Exam e:examList) {
            System.out.println(e.toString());
        }
    }

    @Test
    public void selectById() throws Exception {
        Exam exam=examDao.selectById(3);
        System.out.println(exam.toString());
    }

    @Test
    public void selectWithParams() throws Exception {
        Exam exam=new Exam();
       List<Exam> examList= examDao.selectWithParams(exam);
        for (Exam e:examList) {
            System.out.println(e.toString());
        }
    }


}