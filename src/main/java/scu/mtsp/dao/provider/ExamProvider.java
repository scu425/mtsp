package scu.mtsp.dao.provider;

import org.apache.ibatis.jdbc.SQL;
import scu.mtsp.domain.Exam;

import static scu.mtsp.util.common.MtspConstant.EXAM;

/**
 * @Author:qinsenlin Description:
 * @Date: created in 22:02 2017/12/27
 * @Modified By:
 */
public class ExamProvider {

    /**
    *Description:动态添加
    */
    public String insertWithParams(final Exam exam){
        return new SQL(){
            {
                INSERT_INTO(EXAM);
                if (exam.getWhichPlan()!=null&&!"".equals(exam.getWhichPlan())){
                    VALUES("whichplan","#{whichPlan}");
                }
                if (exam.getRound()!=null&&!"".equals(exam.getRound())){
                    VALUES("round","#{round}");
                }
                if (exam.getAnswer()!=null&&!"".equals(exam.getAnswer())){
                    VALUES("answer","#{answer}");
                }

            }
        }.toString();
    }

    /**
    *Description:动态修改试卷
    */

    public String updateWithParams(final Exam exam){
        return new SQL(){
            {
                UPDATE(EXAM);
                if (exam.getWhichPlan()!=null&&!"".equals(exam.getWhichPlan())){
                    SET("whichplan=#{whichPlan}");
                }
                if (exam.getRound()!=null&&!"".equals(exam.getRound())){
                    SET("round=#{round}");
                }
                if (exam.getAnswer()!=null&&!"".equals(exam.getAnswer())){
                    SET("answer=#{answer}");
                }
                WHERE("id=#{id}");

            }
        }.toString();
    }

    /**
     *description:动态查询
     */
    public String selectWithParams(final Exam exam){
        return new SQL(){
            {
                SELECT("*");
                FROM(EXAM);
                if (exam.getWhichPlan()!=null&&!"".equals(exam.getWhichPlan())){
                    WHERE("whichplan=#{whichPlan}");
                }
                if (exam.getRound()!=null&&!"".equals(exam.getRound())){
                    WHERE("round=#{round}");
                }

            }
        }.toString();
    }
}
