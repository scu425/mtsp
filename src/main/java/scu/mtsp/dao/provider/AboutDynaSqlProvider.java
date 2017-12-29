package scu.mtsp.dao.provider;

import org.apache.ibatis.jdbc.SQL;
import scu.mtsp.domain.About;

import static scu.mtsp.constant.MTSPConstant.ABOUT;

/**
 * Created by zhc on 2017/12/26
 */
public class AboutDynaSqlProvider {
    /**
     * 插入about
     *
     * @param about
     * @return
     */
    public String insertAbout(About about) {
        return new SQL() {
            {
                INSERT_INTO(ABOUT);
                WHERE("about_id = #{aboutId}");
                if (about.getTitleEN() != null && !about.getTitleEN().equals("")){
                    VALUES("titleEN", "#{titleEN}");
                }
                if (about.getTitleCN() != null && !about.getTitleEN().equals("")){
                    VALUES("titleCN", "#{titleCN}");
                }
                if (about.getAboutCN() != null && !about.getAboutCN().equals("")) {
                    VALUES("aboutCN", "#{aboutCN}");
                }
                if (about.getAboutEN() != null && !about.getAboutEN().equals("")) {
                    VALUES("aboutEN", "#{aboutEN}");
                }
            }
        }.toString();
    }

    /**
     * 根据条件选择
     *
     * @param about
     * @return
     */
    public String selectAboutWithParams(About about) {
        return new SQL() {
            {
                SELECT("*");
                FROM(ABOUT);
                if (about.getAboutId() != null && !about.getAboutId().equals("")) {
                    WHERE("about_id = #{aboutId}");
                }
                if (about.getTitleEN() != null && !about.getTitleEN().equals("")){
                    WHERE("titleEN like concat ('%',#{titleEn},'%')");
                }
                if (about.getTitleCN() != null && !about.getTitleEN().equals("")){
                    WHERE("titleCN like concat ('%',#{titleCN},'%')");
                }
                if (about.getAboutCN() != null && !about.getAboutCN().equals("")) {
                    WHERE("aboutCN like concat ('%',#{aboutCN},'%')}");
                }
                if (about.getAboutEN() != null && !about.getAboutEN().equals("")) {
                    WHERE("aboutEN like concat ('%',#{aboutEN},'%')");
                }
            }
        }.toString();
    }

    /**
     * 更新about信息
     *
     * @param about
     * @return
     */
    public String updateAbout(About about) {
        return new SQL() {
            {
                UPDATE(ABOUT);
                WHERE("about_id = #{aboutId}");
                if (about.getTitleEN() != null && !about.getTitleEN().equals("")){
                    SET("titleEN = #{titleEN}");
                }
                if (about.getTitleCN() != null && !about.getTitleEN().equals("")){
                    SET("titleCN = #{titleCN}");
                }
                if (about.getAboutCN() != null && !about.getAboutCN().equals("")) {
                    SET("aboutCN = #{aboutCN}");
                }
                if (about.getAboutEN() != null && !about.getAboutEN().equals("")) {
                    SET("aboutEN = #{aboutCN}");
                }
            }
        }.toString();
    }
}
