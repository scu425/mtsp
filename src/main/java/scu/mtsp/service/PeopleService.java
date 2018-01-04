package scu.mtsp.service;

import scu.mtsp.domain.People;

import java.util.List;

/**
 * Created by zhc on 2017/12/26
 */
public interface PeopleService {
    /**
     * 添加人物介绍
     *
     * @param people
     */
    void addPeople(People people);

    /**
     * 删除人物介绍
     *
     * @param peopleId
     */
    void deletePeopleById(Integer peopleId);

    /**
     * 根据条件查询用户
     *
     * @param people
     * @return
     */
    List<People> findPeopleWithParams(People people);

    /**
     * 修改人物介绍信息
     *
     * @param people
     */
    void modifyPeople(People people);
}
