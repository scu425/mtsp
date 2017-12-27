package scu.mtsp.domain;

import java.io.Serializable;

/**
 * Created by zhc on 2017/12/25
 */
public class User implements Serializable {
    private Integer userId;
    private String loginname;
    private String username;
    private String password;
    private Integer age;
    private String gender;
    private String school;
    private String grade;
    private String email;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

       /* `user_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
        `loginname` varchar(45) NOT NULL,
        `username` varchar(45) NOT NULL,
        `password` varchar(45) NOT NULL,
        `age` int(3) NOT NULL,
        `gender` char(3) NOT NULL,
        `school` varchar(100) NOT NULL,
        `grade` varchar(10) NOT NULL,*/