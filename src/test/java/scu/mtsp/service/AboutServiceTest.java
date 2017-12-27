package scu.mtsp.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import scu.mtsp.domain.About;
import scu.mtsp.service.Impl.AboutServiceImpl;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by zhc on 2017/12/27
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml",
        "classpath:spring/spring-service.xml"})
public class AboutServiceTest {

    @Autowired
    private AboutService aboutService;

    @Test
    public void addAbout() throws Exception {
        About about = new About();
        about.setAboutCN("测试1");
        about.setAboutEN("test1");
        aboutService.addAbout(about);
    }

    @Test
    public void deleteAboutById() throws Exception {
        aboutService.deleteAboutById(1);
    }

    @Test
    public void selectAboutWiathParams() throws Exception {
        About about = new About();
        about.setAboutId(1);
        List<About> abouts = aboutService.selectAboutWithParams(about);
        System.out.println(abouts);

    }

    @Test
    public void updateAbout() throws Exception {
        About about = new About();
        about.setAboutId(1);
        about.setAboutEN("test_modify");
        about.setAboutCN("测试修改");
        aboutService.updateAbout(about);
    }

}