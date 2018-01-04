package scu.mtsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import scu.mtsp.domain.Donate;
import scu.mtsp.service.DonateService;

import java.util.List;

/**
 * Created by zhc on 2017/12/28
 */
@Controller
public class DonateController {
    @Autowired
    @Qualifier("donateService")
    private DonateService donateService;

    @RequestMapping("/donate/show")
    public ModelAndView showDonate(Donate donate, ModelAndView mv){

        List<Donate> donates = donateService.findDonateWithParams(donate);

        mv.addObject("donates", donates);
        mv.setViewName("donate");
        return mv;
    }
}
