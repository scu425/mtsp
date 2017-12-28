package scu.mtsp.service;

import scu.mtsp.domain.AnswerDetailStu;

import java.util.List;

/**
 * @Author:qinsenlin Description:学生答题情况接口
 * @Date: created in 21:56 2017/12/27
 * @Modified By:
 */
public interface AnswerDetailStuService {


    /**
     *description:增加学生答题情况
     */
    void save(AnswerDetailStu answerDetailStu);

    /**
     *description:删除学生答题情况
     */
    void delete(Integer id);

    /**
     *description:修改学生答题情况
     */

    void update(AnswerDetailStu answerDetailStu);

    /**
     *description:动态查询学生答题情况
     */

    List<AnswerDetailStu> selectWithParams(AnswerDetailStu answerDetailStu);

    /**
     *description:根据id查询学生答题情况
     */
    AnswerDetailStu selectById(Integer id);
}
