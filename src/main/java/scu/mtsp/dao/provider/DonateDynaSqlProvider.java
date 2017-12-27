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
                if (donate.getTitle() != null && !donate.getTitle().equals("")) {
                    VALUES("title", "#{donate.title}");
                }
                if (donate.getContent() != null && !donate.getContent().equals("")) {
                    VALUES("content", "#{donate.content}");
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
                    WHERE("donate_id = #{donate.donateId}");
                }
                if (donate.getTitle() != null && !donate.getTitle().equals("")) {
                    WHERE("title = #{donate.title}");
                }
                if (donate.getContent() != null && !donate.getContent().equals("")) {
                    WHERE("content = #{donate.content}");
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
                WHERE("donate_id = #{donate.donateId}");
                if (donate.getTitle() != null && !donate.getTitle().equals("")) {
                    SET("title = #{donate.title}");
                }
                if (donate.getContent() != null && !donate.getContent().equals("")) {
                    SET("content = #{donate.content}");
                }
            }
        }.toString();
    }
}
