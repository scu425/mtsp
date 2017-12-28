package scu.mtsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import scu.mtsp.domain.AnswerDetailStu;
import scu.mtsp.service.AnswerDetailStuService;

import java.util.List;

/**
 * Created by imqsl in  15:44 2017-12-28
 * description:
 */
@Service
public class AnswerDetailStuController {
    /**
     *description:查询学生答题详情
     */
    @Autowired
    AnswerDetailStuService answerDetailStuService;
    @RequestMapping("answerDetailStu/selectAnswerDetailStu")
    public String selectActivity(Model model, @ModelAttribute AnswerDetailStu answerDetailStu){
        List<AnswerDetailStu> answerDetailStuList=answerDetailStuService.selectWithParams(answerDetailStu);
        model.addAttribute("answerDetailStues",answerDetailStuList);
        return "answerDetailStu/answerDetailStu";
    }
    /**
     *description:添加学生答题详情
     */
    @RequestMapping("answerDetailStu/addAnswerDetailStu")
    public ModelAndView addUser(@ModelAttribute AnswerDetailStu answerDetailStu, ModelAndView mv, String flag) {
        if (flag.equals("1")){
            mv.setViewName("answerDetailStu/showAddAnswerDetailStu");
        }else{
            answerDetailStuService.save(answerDetailStu);
            mv.setViewName("redirect:/answerDetailStu/selectAnswerDetailStu");
        }
        return mv;
    }

    /**
     *description:删除学生答题详情
     */
    @RequestMapping("answerDetailStu/deleteAnswerDetailStu")
    public ModelAndView deleteUser(String ids, ModelAndView mv) {
        String idsArray[] = ids.split(",");
        for (String id : idsArray) {
            answerDetailStuService.delete(Integer.parseInt(id));
        }
        mv.setViewName("redirect:/answerDetailStu/selectAnswerDetailStu");
        return mv;
    }

    /**
     *description:修改学生答题详情
     */
    @RequestMapping("answerDetailStu/updateAnswerDetailStu")
    public ModelAndView updateUser(@ModelAttribute AnswerDetailStu answerDetailStu,String flag, ModelAndView mv) {

        if (flag.equals("1")) {
            AnswerDetailStu target = answerDetailStuService.selectById(answerDetailStu.getId());
            mv.addObject("answerDetailStu", target);
            mv.setViewName("answerDetailStu/showUpdateAnswerDetailStu");
        } else {
            answerDetailStuService.update(answerDetailStu);
            mv.setViewName("redirect:/answerDetailStu/selectAnswerDetailStu");
        }
        return mv;
    }
}
