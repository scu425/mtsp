package scu.mtsp.domain;

import java.io.Serializable;

/**
 * Created by zhc on 2017/12/25
 */
public class Donate implements Serializable {
    private Integer donateId;
    private String titleEN;
    private String contentEN;
    private String titleCN;
    private String contentCN;

    public Integer getDonateId() {
        return donateId;
    }

    public void setDonateId(Integer donateId) {
        this.donateId = donateId;
    }

    public String getTitleEN() {
        return titleEN;
    }

    public void setTitleEN(String titleEN) {
        this.titleEN = titleEN;
    }

    public String getContentEN() {
        return contentEN;
    }

    public void setContentEN(String contentEN) {
        this.contentEN = contentEN;
    }

    public String getTitleCN() {
        return titleCN;
    }

    public void setTitleCN(String titleCN) {
        this.titleCN = titleCN;
    }

    public String getContentCN() {
        return contentCN;
    }

    public void setContentCN(String contentCN) {
        this.contentCN = contentCN;
    }

    @Override
    public String toString() {
        return "Donate{" +
                "donateId=" + donateId +
                ", titleEN='" + titleEN + '\'' +
                ", contentEN='" + contentEN + '\'' +
                ", titleCN='" + titleCN + '\'' +
                ", contentCN='" + contentCN + '\'' +
                '}';
    }
}

        /*CREATE TABLE `donate` (
        `donate_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
        `title` varchar(45) NOT NULL,
        `content` varchar(1000) DEFAULT NULL,
        PRIMARY KEY (`donate_id`)
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8;*/