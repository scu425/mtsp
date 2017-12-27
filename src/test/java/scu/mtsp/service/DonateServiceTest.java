package scu.mtsp.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import scu.mtsp.domain.Donate;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by zhc on 2017/12/27
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml",
        "classpath:spring/spring-service.xml"})
public class DonateServiceTest {
    @Autowired
    private DonateService donateService;

    @Test
    public void addDonate() throws Exception {
        Donate donate = new Donate();
        donate.setTitle("秦森林老总2");
        donate.setContent("捐赠20块钱");
        donateService.addDonate(donate);
    }

    @Test
    public void deleteDonateById() throws Exception {
        donateService.deleteDonateById(2);
    }

    @Test
    public void findDonateWithParams() throws Exception {
        Donate donate = new Donate();
        donate.setTitle("秦");
        List<Donate> donates = donateService.findDonateWithParams(donate);
        System.out.println(donates);
    }

    @Test
    public void modifyDonate() throws Exception {
        Donate donate = new Donate();
        donate.setDonateId(2);
        donate.setTitle("朱汉成大神");
        donate.setContent("捐赠一千亿");
        donateService.modifyDonate(donate);
    }

}