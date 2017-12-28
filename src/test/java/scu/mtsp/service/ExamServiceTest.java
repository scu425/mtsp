package scu.mtsp.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import scu.mtsp.domain.Exam;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by imqsl on 2017-12-28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class ExamServiceTest {
    @Autowired
    ExamService examService;

    @Test
    public void save() throws Exception {
        examService.save(new Exam("a","2","1 2 5",new Date()));
    }

    @Test
    public void delete() throws Exception {
    }

    @Test
    public void update() throws Exception {
    }

    @Test
    public void selectWithParams() throws Exception {
    }

}