package scu.mtsp.domain;

import java.io.Serializable;

/**
 * Created by zhc on 2017/12/25
 */
public class Teacher implements Serializable {
    private Integer teacherId;
    private String loginname;
    private String username;
    private String password;
    private String school;

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", loginname='" + loginname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
}

    /*CREATE TABLE `teacher` (
        `teacher_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
        `loginname` varchar(45) NOT NULL,
        `username` varchar(45) NOT NULL,
        `password` varchar(45) NOT NULL,
        `school` varchar(45) NOT NULL,
        PRIMARY KEY (`teacher_id`)
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8;*/