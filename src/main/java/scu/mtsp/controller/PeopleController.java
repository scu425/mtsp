package scu.mtsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import scu.mtsp.domain.People;
import scu.mtsp.service.PeopleService;

import java.util.List;

/**
 * Created by zhc on 2017/12/27
 */
@Controller
public class PeopleController {

    @Autowired
    @Qualifier("peopleService")
    private PeopleService peopleService;

    @RequestMapping("/people/show")
    public ModelAndView showPeople(People people, ModelAndView mv, String flag){
        List<People> peoples = peopleService.findPeopleWithParams(people);
        mv.addObject("peoples",peoples);
        mv.setViewName("people/showPeople");
        return mv;
    }
}
