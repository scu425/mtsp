package scu.mtsp.service;

import scu.mtsp.domain.Donate;

import java.util.List;

/**
 * Created by zhc on 2017/12/26
 */
public interface DonateService {
    /**
     * 增加赞助信息
     *
     * @param donate
     */
    void addDonate(Donate donate);

    /**
     * 根据id删除
     *
     * @param donateId
     */
    void deleteDonateById(Integer donateId);

    /**
     * 根据条件查询
     *
     * @param donate
     * @return
     */
    List<Donate> findDonateWithParams(Donate donate);

    /**
     * 修改赞助信息
     *
     * @param donate
     */
    void modifyDonate(Donate donate);
}
