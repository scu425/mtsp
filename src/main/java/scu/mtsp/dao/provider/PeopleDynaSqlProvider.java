package scu.mtsp.dao.provider;

import org.apache.ibatis.jdbc.SQL;
import scu.mtsp.domain.People;

import static scu.mtsp.constant.MTSPConstant.PEOPLE;

/**
 * Created by zhc on 2017/12/25
 */
public class PeopleDynaSqlProvider {
    /**
     * 插入用户
     *
     * @param people
     * @return
     */
    public String insertPeople(People people) {
        return new SQL() {
            {
                INSERT_INTO(PEOPLE);
                if (people.getNameCN() != null && !people.getNameCN().equals("")) {
                    VALUES("nameCN", "#{nameCN}");
                }
                if (people.getNameEN() != null && !people.getNameEN().equals("")) {
                    VALUES("nameEn", "#{nameEN}");
                }
                if (people.getIntroductionCN() != null && !people.getIntroductionCN().equals("")) {
                    VALUES("introductionCN", "#{introductionCN}");
                }
                if (people.getIntroductionEN() != null && !people.getIntroductionEN().equals("")) {
                    VALUES("introductionEN", "introductionEN");
                }
                if (people.getPhoto() != null && !people.getPhoto().equals("")) {
                    VALUES("photo", "#{photo}");
                }
            }
        }.toString();
    }

    /**
     * 更新人物介绍
     *
     * @param people
     * @return
     */
    public String updatePeople(People people) {
        return new SQL() {
            {
                UPDATE(PEOPLE);
                WHERE("people_id = #{peopleId}");
                if (people.getNameCN() != null && !people.getNameCN().equals("")) {
                    SET("nameCN = #{nameCN}");
                }
                if (people.getNameEN() != null && !people.getNameEN().equals("")) {
                    SET("nameEN = #{nameEN}");
                }
                if (people.getIntroductionCN() != null && !people.getIntroductionCN().equals("")) {
                    SET("introductionCN = #{introductionEN}");
                }
                if (people.getIntroductionEN() != null && !people.getIntroductionEN().equals("")) {
                    SET("introductionEN = #{introductionEN}");
                }
                if (people.getPhoto() != null && !people.getPhoto().equals("")) {
                    SET("photo = #{photo}");
                }
            }
        }.toString();
    }

    /**
     * 根绝条件查找人物介绍
     *
     * @param people
     * @return
     */
    public String selectPeopleWithParams(People people) {
        return new SQL() {
            {
                SELECT("*");
                FROM(PEOPLE);
                if (people.getPeopleId() != null && !people.getPeopleId().equals("")) {
                    WHERE("people_id = #{peopleId}");
                }
                if (people.getNameCN() != null && !people.getNameCN().equals("")) {
                    WHERE("nameCN like concat ('%',#{nameCN},'%')");
                }
                if (people.getNameEN() != null && !people.getNameEN().equals("")) {
                    WHERE("nameEN like concat ('%',#{nameEN},'%')");
                }
                /*if (people.getIntroductionCN() != null && !people.getIntroductionCN().equals("")){
                    SET("introductionCN = #{people.introductionEN}");
                }
                if (people.getIntroductionEN() != null && !people.getIntroductionEN().equals("")){
                    SET("introductionEN = #{people.introductionEN}");
                }
                if (people.getPhoto() != null && !people.getPhoto().equals("")){
                    SET("photo = #{people.photo}");
                }*/
            }
        }.toString();
    }

}
