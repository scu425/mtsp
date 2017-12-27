package scu.mtsp.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import scu.mtsp.dao.provider.DonateDynaSqlProvider;
import scu.mtsp.domain.Donate;

import java.util.List;

import static scu.mtsp.constant.MTSPConstant.DONATE;

/**
 * Created by zhc on 2017/12/25
 */
public interface DonateDAO {
    /**
     * 插入捐赠
     *
     * @param donate
     */
    @SelectProvider(type = DonateDynaSqlProvider.class, method = "insertDonate")
    void insertDonate(Donate donate);

    /**
     * 根据id删除捐赠信息
     *
     * @param donateId
     */
    @Delete("delete from " + DONATE + " where donate_id = #{donateId}")
    void deleteDonateById(@Param("donateId") Integer donateId);

    /**
     * 根绝条件查询
     *
     * @param donate
     * @return
     */
    @SelectProvider(type = DonateDynaSqlProvider.class, method = "selectDonateWithParams")
    List<Donate> selectDonateWithParams(Donate donate);

    /**
     * 更新捐赠信息
     *
     * @param donate
     */
    @SelectProvider(type = DonateDynaSqlProvider.class, method = "updateDonate")
    void updateDonate(Donate donate);
}
