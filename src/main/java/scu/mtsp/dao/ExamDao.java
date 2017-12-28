package scu.mtsp.dao;

import org.apache.ibatis.annotations.*;
import scu.mtsp.dao.provider.ExamProvider;
import scu.mtsp.domain.Exam;

import java.util.List;

import static scu.mtsp.util.common.MtspConstant.EXAM;

/**
 * @Author:qinsenlin Description:试卷dao层
 * @Date: created in 21:55 2017/12/27
 * @Modified By:
 */
public interface ExamDao {

    /**
    *Description:添加试卷
    */
    @InsertProvider(type = ExamProvider.class,method = "insertWithParams")
    void save(Exam exam);


    /**
    *Description:根据id删除试卷
    */
    @Delete("delete from "+ EXAM +" where id=#{id}")
    void delete(Integer id);

    /**
    *Description:修改试卷
    */
    @UpdateProvider(type = ExamProvider.class,method = "updateWithParams")
    void update(Exam exam);

    /**
    *Description:查询所有
    */
    @Select("select * from "+EXAM+" ")
    List<Exam> selectAll();

    /**
    *Description:根据id查询
    */
    @Select("select * from "+ EXAM+" where id=#{id}")
    Exam selectById(Integer id);

    /**
     *description:动态查询
     */
    @SelectProvider(type = ExamProvider.class,method = "selectWithParams")
    List<Exam> selectWithParams(Exam exam);
}
