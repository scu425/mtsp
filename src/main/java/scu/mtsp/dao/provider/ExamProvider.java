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
                if (exam.getName()!=null&&!"".equals(exam.getName())){
                    VALUES("name","#{name}");
                }
                if (exam.getAnswer()!=null&&!"".equals(exam.getAnswer())){
                    VALUES("answer","#{answer}");
                }

            }
        }.toString();
    }

    /**
    *Description:动态修改试卷，包括每个题的答案可能有误
    */

    public String updateWithParams(final Exam exam){
        return new SQL(){
            {
                UPDATE(EXAM);
                if (exam.getName()!=null&&!"".equals(exam.getName())){
                    SET("name=#{name}");
                }
                if (exam.getAnswer()!=null&&!"".equals(exam.getAnswer())){
                    SET("answer=#{answer}");
                }
                WHERE("id=#{id}");

            }
        }.toString();
    }
}
