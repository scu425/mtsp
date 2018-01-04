package scu.mtsp.domain;

import java.io.Serializable;

/**
 * Created by zhc on 2017/12/25
 */
public class People implements Serializable {
    private Integer peopleId;
    private String nameEN;
    private String nameCN;
    private String introductionEN;
    private String introductionCN;
    private String photo;

    public Integer getPeopleId() {
        return peopleId;
    }

    public void setPeopleId(Integer peopleId) {
        this.peopleId = peopleId;
    }

    public String getNameEN() {
        return nameEN;
    }

    public void setNameEN(String nameEN) {
        this.nameEN = nameEN;
    }

    public String getNameCN() {
        return nameCN;
    }

    public void setNameCN(String nameCN) {
        this.nameCN = nameCN;
    }

    public String getIntroductionEN() {
        return introductionEN;
    }

    public void setIntroductionEN(String introductionEN) {
        this.introductionEN = introductionEN;
    }

    public String getIntroductionCN() {
        return introductionCN;
    }

    public void setIntroductionCN(String introductionCN) {
        this.introductionCN = introductionCN;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "People{" +
                "peopleId=" + peopleId +
                ", nameEN='" + nameEN + '\'' +
                ", nameCN='" + nameCN + '\'' +
                ", introductionEN='" + introductionEN + '\'' +
                ", introductionCN='" + introductionCN + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }
}


   /* CREATE TABLE `people` (
        `people_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
        `nameEN` varchar(45) NOT NULL,
        `nameCN` varchar(45) NOT NULL,
        `introductionEN` varchar(255) NOT NULL,
        `introductionCN` varchar(255) NOT NULL,
        `photo` varchar(255) NOT NULL,
        PRIMARY KEY (`people_id`)
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8;*/