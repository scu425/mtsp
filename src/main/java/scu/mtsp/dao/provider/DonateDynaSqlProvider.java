package scu.mtsp.dao.provider;

import org.apache.ibatis.jdbc.SQL;
import scu.mtsp.domain.Donate;

import static scu.mtsp.constant.MTSPConstant.DONATE;

/**
 * Created by zhc on 2017/12/26
 */
public class DonateDynaSqlProvider {
    /**
     * 插入用户
     *
     * @param donate
     * @return
     */
    public String insertDonate(Donate donate) {
        return new SQL() {
            {
                INSERT_INTO(DONATE);
                if (donate.getTitleCN() != null && !donate.getTitleCN().equals("")) {
                    VALUES("titleCN", "#{titleCN}");
                }
                if (donate.getTitleEN() != null && !donate.getTitleEN().equals("")) {
                    VALUES("titleEN", "#{titleEN}");
                }
                if (donate.getContentCN() != null && !donate.getTitleCN().equals("")){
                    VALUES("contentCN", "#{contentCN}");
                }
                if (donate.getContentEN() != null && !donate.getContentEN().equals("")){
                    VALUES("contentEN", "#{contentEN}");
                }
            }
        }.toString();
    }

    /**
     * 根据条件查询赞助
     *
     * @param donate
     * @return
     */
    public String selectDonateWithParams(Donate donate) {
        return new SQL() {
            {
                SELECT("*");
                FROM(DONATE);
                if (donate.getDonateId() != null && !donate.getDonateId().equals("")) {
                    WHERE("donate_id = #{donateId}");
                }
                if (donate.getTitleCN() != null && !donate.getTitleCN().equals("")) {
                    WHERE("titleCN = #{titleCN}");
                }
                if (donate.getTitleEN() != null && !donate.getTitleEN().equals("")) {
                    WHERE("titleEN = #{titleEN}");
                }
                if (donate.getContentCN() != null && !donate.getTitleCN().equals("")){
                    WHERE("contentCN = #{contentCN}");
                }
                if (donate.getContentEN() != null && !donate.getContentEN().equals("")){
                    WHERE("contentEN = #{contentEN}");
                }
            }
        }.toString();
    }

    /**
     * 更新修改信息
     *
     * @param donate
     * @return
     */
    public String updateDonate(Donate donate) {
        return new SQL() {
            {
                UPDATE(DONATE);
                WHERE("donate_id = #{donateId}");
                if (donate.getTitleCN() != null && !donate.getTitleCN().equals("")) {
                    SET("titleCN like concat ('%',#{titleCN},'%')");
                }
                if (donate.getTitleEN() != null && !donate.getTitleEN().equals("")) {
                    SET("titleEN like concat ('%',#{titleEN},'%')");
                }
                if (donate.getContentCN() != null && !donate.getTitleCN().equals("")){
                    SET("contentCN like concat ('%',#{contentCN},'%')");
                }
                if (donate.getContentEN() != null && !donate.getContentEN().equals("")){
                    SET("contentEN like concat ('%',#{contentEN},'%')");
                }
            }
        }.toString();
    }
}
