package scu.mtsp.domain;

import java.io.Serializable;

/**
 * Created by zhc on 2017/12/25
 */
public class About implements Serializable {
    private Integer aboutId;
    private String aboutEN;
    private String aboutCN;

    public Integer getAboutId() {
        return aboutId;
    }

    public void setAboutId(Integer aboutId) {
        this.aboutId = aboutId;
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
}


   /* CREATE TABLE `about` (
        `about_id` int(10) NOT NULL,
        `aboutEN` varchar(1000) NOT NULL,
        `aboutCN` varchar(1000) NOT NULL,
        PRIMARY KEY (`about_id`)
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8;*/