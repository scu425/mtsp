package scu.mtsp.domain;

import java.io.Serializable;

/**
 * Created by zhc on 2017/12/25
 */
public class Donate implements Serializable {
    private Integer donateId;
    private String title;
    private String content;

    public Integer getDonateId() {
        return donateId;
    }

    public void setDonateId(Integer donateId) {
        this.donateId = donateId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

        /*CREATE TABLE `donate` (
        `donate_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
        `title` varchar(45) NOT NULL,
        `content` varchar(1000) DEFAULT NULL,
        PRIMARY KEY (`donate_id`)
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8;*/