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
                    VALUES("nameCN", "#{people.nameCN}");
                }
                if (people.getNameEN() != null && !people.getNameEN().equals("")) {
                    VALUES("nameEn", "#{peopel.nameEN}");
                }
                if (people.getIntroductionCN() != null && !people.getIntroductionCN().equals("")) {
                    VALUES("introductionCN", "#{people.introductionCN}");
                }
                if (people.getIntroductionEN() != null && !people.getIntroductionEN().equals("")) {
                    VALUES("introductionEN", "introductionEN");
                }
                if (people.getPhoto() != null && !people.getPhoto().equals("")) {
                    VALUES("photo", "#{people.photo}");
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
                WHERE("people_id = #{people.peopleId}");
                if (people.getNameCN() != null && !people.getNameCN().equals("")) {
                    SET("nameCN = #{people.nameCN}");
                }
                if (people.getNameEN() != null && !people.getNameEN().equals("")) {
                    SET("nameEN = #{people.nameEN}");
                }
                if (people.getIntroductionCN() != null && !people.getIntroductionCN().equals("")) {
                    SET("introductionCN = #{people.introductionEN}");
                }
                if (people.getIntroductionEN() != null && !people.getIntroductionEN().equals("")) {
                    SET("introductionEN = #{people.introductionEN}");
                }
                if (people.getPhoto() != null && !people.getPhoto().equals("")) {
                    SET("photo = #{people.photo}");
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
                    WHERE("people_id = #{people.peopleId}");
                }
                if (people.getNameCN() != null && !people.getNameCN().equals("")) {
                    WHERE("nameCN like concat ('%',#{people.nameCN},'%')");
                }
                if (people.getNameEN() != null && !people.getNameEN().equals("")) {
                    WHERE("nameEN like concat ('%',#{people.nameEN},'%')");
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
