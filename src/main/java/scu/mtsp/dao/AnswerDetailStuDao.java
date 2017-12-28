package scu.mtsp.dao;

import org.apache.ibatis.annotations.*;
import scu.mtsp.dao.provider.AnswerDetailStuProvider;
import scu.mtsp.domain.AnswerDetailStu;

import java.util.List;

import static scu.mtsp.util.common.MtspConstant.ANSWERDETAILSTU;

/**
 * @Author:qinsenlin Description:学生考试详情
 * @Date: created in 21:56 2017/12/27
 * @Modified By:
 */
public interface AnswerDetailStuDao {

    /**
     *Description:添加学生考试详情
     */
    @InsertProvider(type = AnswerDetailStuProvider.class,method = "insertWithParams")
    void save(AnswerDetailStu answerDetailStu);


    /**
     *Description:根据id删除学生考试详情
     */
    @Delete("delete from "+ ANSWERDETAILSTU +" where id=#{id}")
    void delete(Integer id);

    /**
     *Description:修改学生考试详情
     */
    @UpdateProvider(type = AnswerDetailStuProvider.class,method = "updateWithParams")
    void update(AnswerDetailStu answerDetailStu);

    /**
     *Description:查询所有
     */
    @Select("select * from "+ANSWERDETAILSTU+" ")
    List<AnswerDetailStu> selectAll();

    /**
     *Description:根据id查询
     */
    @Select("select * from "+ ANSWERDETAILSTU+" where id=#{id}")
    AnswerDetailStu selectById(Integer id);

    /**
     *description:动态查询
     */
    @SelectProvider(type = AnswerDetailStuProvider.class,method = "selectWithParams")
    List<AnswerDetailStu> selectWithParams(AnswerDetailStu answerDetailStu);
}
