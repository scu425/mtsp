package scu.mtsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import scu.mtsp.domain.AnswerDetailStu;
import scu.mtsp.domain.Exam;
import scu.mtsp.service.AnswerDetailStuService;
import scu.mtsp.service.ExamService;

import java.util.List;

/**
 * Created by imqsl in  15:44 2017-12-28
 * description:
 */
@Controller
public class AnswerDetailStuController {
    /**
     *description:查询学生答题详情
     */
    @Autowired
    AnswerDetailStuService answerDetailStuService;
    @Autowired
    ExamService examService;
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

    /**
     *Description:用户端提交答案
     */
    @RequestMapping("commitAnswer")
    public ModelAndView commitAnswer(ModelAndView mv,String answer){
        String answerList1[]=answer.split("  ");
        for (String s:answerList1) {
            System.out.print(s+" ");
        }
        String userAnswer="";
        for (int i=0;i<answerList1.length;i++){
            System.out.println(answerList1[i]);
            if (i<9)
            {
                userAnswer=userAnswer+answerList1[i]+" ";
            }
            else {
                userAnswer=userAnswer+answerList1[i];
            }
        }
        System.out.println(answerList1.length);
        Exam exam=examService.selectByWhichPlanAndRound("a","1");
        String answerList2[]=exam.getAnswer().split(" ");
        for (String s:answerList2) {
            System.out.print(s+" ");
        }
        System.out.println(answerList2.length);
        int num=0;
        for (int i=0;i<answerList1.length;i++){
            if (answerList1[i].equals(answerList2[i])){
                num++;
            }
        }
        System.out.println("分数为："+num*10);
        AnswerDetailStu answerDetailStu=new AnswerDetailStu();
        answerDetailStu.setAnswer(userAnswer);
        answerDetailStu.setScore(num*10);
        answerDetailStu.setExamId(2);
        answerDetailStu.setUserId(1);
        answerDetailStuService.save(answerDetailStu);
        mv.setViewName("commitsuccess");
        return mv;
    }
}
