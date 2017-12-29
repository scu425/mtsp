package scu.mtsp.service;

import scu.mtsp.domain.Exam;

import java.util.List;

/**
 * @Author:qinsenlin Description:试题服务接口
 * @Date: created in 21:55 2017/12/27
 * @Modified By:
 */
public interface ExamService {

    /**
     *description:增加试题
     */
    void save(Exam exam);

    /**
     *description:删除试题
     */
    void delete(Integer id);

    /**
     *description:修改试题
     */

    void update(Exam exam);

    /**
     *description:动态查询试题
     */

    List<Exam> selectWithParams(Exam exam);

    /**
     *description:根据id查询试题
     */
    Exam selectById(Integer id);

    /**
     *Description:根据whichplan和round查询
     *
     */
    Exam selectByWhichPlanAndRound(String whichPlan,String round);

}
