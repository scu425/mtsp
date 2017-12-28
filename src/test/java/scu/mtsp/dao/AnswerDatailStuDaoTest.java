package scu.mtsp.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import scu.mtsp.domain.AnswerDetailStu;

import java.util.Date;
import java.util.List;

/**
 * Created by imqsl on 2017-12-28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class AnswerDatailStuDaoTest {
    @Autowired
    AnswerDetailStuDao answerDetailStuDao;
    @Test
    public void save() throws Exception {
        answerDetailStuDao.save(new AnswerDetailStu(1,2,"abc d",100,new Date()));
    }

    @Test
    public void delete() throws Exception {
        answerDetailStuDao.delete(2);
    }

    @Test
    public void update() throws Exception {
        AnswerDetailStu answerDetailStu=new AnswerDetailStu();
        answerDetailStu.setId(2);
        answerDetailStu.setScore(99);
        answerDetailStuDao.update(answerDetailStu);

    }

    @Test
    public void selectAll() throws Exception {
        List<AnswerDetailStu> answerDetailStuList=answerDetailStuDao.selectAll();
        for (AnswerDetailStu a:answerDetailStuList) {
            System.out.println(a.toString());
        }
    }

    @Test
    public void selectById() throws Exception {
        AnswerDetailStu answerDetailStu=answerDetailStuDao.selectById(3);
        System.out.println(answerDetailStu.toString());
    }

    @Test
    public void selectWithParams() throws Exception {
        AnswerDetailStu answerDetailStu=new AnswerDetailStu();
       List<AnswerDetailStu> answerDetailStuList= answerDetailStuDao.selectWithParams(answerDetailStu);
        for (AnswerDetailStu a:answerDetailStuList) {
            System.out.println(a.toString());
        }
    }

}