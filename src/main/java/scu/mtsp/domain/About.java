package scu.mtsp.domain;

import java.io.Serializable;

/**
 * Created by zhc on 2017/12/25
 */
public class About implements Serializable {
    private Integer aboutId;
    private String titleEN;
    private String titleCN;
    private String aboutEN;
    private String aboutCN;

    public Integer getAboutId() {
        return aboutId;
    }

    public void setAboutId(Integer aboutId) {
        this.aboutId = aboutId;
    }

    public String getTitleEN() {
        return titleEN;
    }

    public void setTitleEN(String titleEN) {
        this.titleEN = titleEN;
    }

    public String getTitleCN() {
        return titleCN;
    }

    public void setTitleCN(String titleCN) {
        this.titleCN = titleCN;
    }

    public String getAboutEN() {
        return aboutEN;
    }

    public void setAboutEN(String aboutEN) {
        this.aboutEN = aboutEN;
    }

    public String getAboutCN() {
        return aboutCN;
    }

    public void setAboutCN(String aboutCN) {
        this.aboutCN = aboutCN;
    }

    @Override
    public String toString() {
        return "About{" +
                "aboutId=" + aboutId +
                ", aboutEN='" + aboutEN + '\'' +
                ", aboutCN='" + aboutCN + '\'' +
                '}';
    }
}


   /* CREATE TABLE `about` (
        `about_id` int(10) NOT NULL,
        `aboutEN` varchar(1000) NOT NULL,
        `aboutCN` varchar(1000) NOT NULL,
        PRIMARY KEY (`about_id`)
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8;*/