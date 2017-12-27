package scu.mtsp.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import scu.mtsp.domain.User;

import static org.junit.Assert.*;

/**
 * Created by zhc on 2017/12/27
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml",
        "classpath:spring/spring-service.xml"})
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void login() throws Exception {
        User user = userService.login(null,"zhc@163.com","123456");
        System.out.println(user);
    }

    @Test
    public void addUser() throws Exception {
        User user = new User();
        user.setAge(11);
        user.setEmail("zy@163.com");
        user.setGender("男");
        user.setGrade("初一");
        user.setLoginname("zy");
        user.setPassword("123456");
        user.setSchool("五中");
        user.setUsername("周游");
        userService.addUser(user);
    }

    @Test
    public void deleteUserById() throws Exception {
        userService.deleteUserById(4);
    }

    @Test
    public void findUserWithParams() throws Exception {
        User user = new User();
        user.setSchool("七中");
        System.out.println(userService.findUserWithParams(user));;
    }

    @Test
    public void modifyUser() throws Exception {

    }

}