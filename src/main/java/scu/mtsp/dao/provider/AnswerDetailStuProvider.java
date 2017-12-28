package scu.mtsp.dao.provider;

import org.apache.ibatis.jdbc.SQL;
import scu.mtsp.domain.AnswerDetailStu;

import static scu.mtsp.util.common.MtspConstant.ANSWERDETAILSTU;

/**
 * @Author:qinsenlin Description:动态增删改查学生考试详情
 * @Date: created in 22:02 2017/12/27
 * @Modified By:
 */
    public class AnswerDetailStuProvider {

        /**
         *Description:动态添加学生考试详情
         */
        public String insertWithParams(final AnswerDetailStu answerDetailStu){
            return new SQL(){
                {
                    INSERT_INTO(ANSWERDETAILSTU);
                    if (answerDetailStu.getExamId()!=null&&!"".equals(answerDetailStu.getExamId())){
                        VALUES("exam_id","#{examId}");
                    }
                    if (answerDetailStu.getUserId()!=null&&!"".equals(answerDetailStu.getUserId())){
                        VALUES("user_id","#{userId}");
                    }
                    if (answerDetailStu.getAnswer()!=null&&!"".equals(answerDetailStu.getAnswer())){
                        VALUES("answer","#{answer}");
                    }
                    if (answerDetailStu.getScore()!=null&&!"".equals(answerDetailStu.getScore())){
                        VALUES("score","#{score}");
                    }

                }
            }.toString();
        }

        /**
         *Description:动态修改学生考试详情
         */

        public String updateWithParams(final AnswerDetailStu answerDetailStu){
            return new SQL(){
                {
                    UPDATE(ANSWERDETAILSTU);
                    if (answerDetailStu.getExamId()!=null&&!"".equals(answerDetailStu.getExamId())){
                        SET("exam_id=#{examId}");
                    }
                    if (answerDetailStu.getUserId()!=null&&!"".equals(answerDetailStu.getUserId())){
                        SET("user_id=#{userId}");
                    }
                    if (answerDetailStu.getAnswer()!=null&&!"".equals(answerDetailStu.getAnswer())){
                        SET("answer=#{answer}");
                    }
                    if (answerDetailStu.getScore()!=null&&!"".equals(answerDetailStu.getScore())){
                        SET("score=#{score}");
                    }
                    WHERE("id=#{id}");

                }
            }.toString();
        }

        /**
         *description:动态查询学生考试详情
         */
        public String selectWithParams(final AnswerDetailStu answerDetailStu){
            return new SQL(){
                {
                    SELECT("*");
                    FROM(ANSWERDETAILSTU);
                    if (answerDetailStu.getExamId()!=null&&!"".equals(answerDetailStu.getExamId())){
                        WHERE("exam_id=#{examId}");
                    }
                    if (answerDetailStu.getUserId()!=null&&!"".equals(answerDetailStu.getUserId())){
                        WHERE("user_id=#{userId}");
                    }
                    if (answerDetailStu.getScore()!=null&&!"".equals(answerDetailStu.getScore())){
                        WHERE("score=#{score}");
                    }

                }
            }.toString();
        }
    }


