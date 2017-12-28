package scu.mtsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import scu.mtsp.domain.Exam;
import scu.mtsp.service.ExamService;

import java.util.List;

/**
 * Created by imqsl on 2017-12-28.
 */
@Controller
public class ExamController {
    /**
     *description:查询试题
     */
    @Autowired
    ExamService examService;
    @RequestMapping("exam/selectExam")
    public String selectExam(Model model, @ModelAttribute Exam exam){
        List<Exam> examList=examService.selectWithParams(exam);
        model.addAttribute("exams",examList);
        return "exam/exam";
    }

    /**
     *description:添加试题
     */
    @RequestMapping("exam/addExam")
    public ModelAndView addUser(@ModelAttribute Exam exam, ModelAndView mv, String flag) {
        if (flag.equals("1")){
            mv.setViewName("exam/showAddExam");
        }else{
            examService.save(exam);
            mv.setViewName("redirect:/exam/selectExam");
        }
        return mv;
    }

    /**
     *description:删除试题
     */
    @RequestMapping("exam/deleteExam")
    public ModelAndView deleteUser(String ids, ModelAndView mv) {
        String idsArray[] = ids.split(",");
        for (String id : idsArray) {
            examService.delete(Integer.parseInt(id));
        }
        mv.setViewName("redirect:/exam/selectExam");
        return mv;
    }

    /**
     *description:修改试题
     */
    @RequestMapping("exam/updateExam")
    public ModelAndView updateUser(@ModelAttribute Exam exam,String flag, ModelAndView mv) {
        if (flag.equals("1")) {
            Exam target = examService.selectById(exam.getId());
            mv.addObject("exam", target);
            mv.setViewName("exam/showUpdateExam");
        } else {
            examService.update(exam);
            mv.setViewName("redirect:/exam/selectExam");
        }
        return mv;
    }

}
