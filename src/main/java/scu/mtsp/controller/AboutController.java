package scu.mtsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import scu.mtsp.domain.About;
import scu.mtsp.service.AboutService;

import java.util.List;

/**
 * Created by zhc on 2017/12/28
 */
@Controller
public class AboutController {

    @Autowired
    @Qualifier("aboutService")
    private AboutService aboutService;

    @RequestMapping("/about/show")
    public ModelAndView showAbout(About about, ModelAndView mv){
        List<About> abouts = aboutService.selectAboutWithParams(about);
        About about1 = new About();
        for (About about2 : abouts){
            if (about2 != null){
                about1 = about2;
            }
        }
        mv.addObject("about", about1);
        mv.setViewName("about/showAbout");
        return mv;
    }
}
