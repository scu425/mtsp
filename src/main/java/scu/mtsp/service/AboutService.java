package scu.mtsp.service;

import scu.mtsp.domain.About;

import java.util.List;

/**
 * Created by zhc on 2017/12/26
 */
public interface AboutService {
    /**
     * 增加介绍信息
     *
     * @param about
     */
    void addAbout(About about);

    /**
     * 根据id删除about
     *
     * @param aboutId
     */
    void deleteAboutById(Integer aboutId);

    /**
     * 根据条件查询介绍信息
     *
     * @param about
     * @return
     */
    List<About> selectAboutWithParams(About about);

    /**
     * 修改介绍信息
     *
     * @param about
     */
    void updateAbout(About about);
}
