package scu.mtsp.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import scu.mtsp.dao.provider.AboutDynaSqlProvider;
import scu.mtsp.domain.About;

import java.util.List;

import static scu.mtsp.util.common.MtspConstant.ABOUT;

/**
 * Created by zhc on 2017/12/25
 */
public interface AboutDao {
    /**
     * 插入介绍
     *
     * @param about
     */
    @SelectProvider(type = AboutDynaSqlProvider.class, method = "insertAbout")
    void insertAbout(About about);

    /**
     * 根据id删除介绍
     *
     * @param aboutId
     */
    @Delete("delete from " + ABOUT + " where about_id = #{aboutId}")
    void deleteAboutById(@Param("aboutId") Integer aboutId);

    /**
     * 根据条件查询
     *
     * @param about
     * @return
     */
    @SelectProvider(type = AboutDynaSqlProvider.class, method = "selectAboutWithParams")
    List<About> selectAboutWithParams(About about);

    /**
     * 更新赞助信息
     *
     * @param about
     */
    @SelectProvider(type = AboutDynaSqlProvider.class, method = "updateAbout")
    void updateAbout(About about);
}
