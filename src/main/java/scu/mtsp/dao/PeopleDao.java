package scu.mtsp.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import scu.mtsp.dao.provider.PeopleDynaSqlProvider;
import scu.mtsp.domain.People;

import java.util.List;
import static scu.mtsp.util.common.MtspConstant.PEOPLE;

/**
 * Created by zhc on 2017/12/25
 */
public interface PeopleDao {

    /**
     * 插入人物介绍
     *
     * @param people
     */
    @SelectProvider(type = PeopleDynaSqlProvider.class, method = "insertPeople")
    void insertPeople(People people);

    /**
     * 根绝id删除人物介绍
     *
     * @param peopleId
     */
    @Delete("delete from " + PEOPLE + " where people_id = #{peopleId}")
    void deletePeopleById(@Param("peopleId") Integer peopleId);

    /**
     * 根绝条件查询人物介绍
     *
     * @param people
     * @return
     */
    @SelectProvider(type = PeopleDynaSqlProvider.class, method = "selectPeopleWithParams")
    List<People> selectPeopleWithParams(People people);

    /**
     * 修改人物介绍
     *
     * @param people
     */
    @SelectProvider(type = PeopleDynaSqlProvider.class, method = "updatePeople")
    void updatePeople(People people);
}
