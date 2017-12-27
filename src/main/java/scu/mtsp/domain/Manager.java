package scu.mtsp.domain;

import java.io.Serializable;

/**
 * Created by zhc on 2017/12/25
 */
public class Manager implements Serializable {
    private Integer managerId;
    private String loginname;
    private String username;
    private String password;

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
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

    @Override
    public String toString() {
        return "Manager{" +
                "managerId=" + managerId +
                ", loginname='" + loginname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

    /*CREATE TABLE `manager` (
        `manager_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
        `loginname` varchar(45) NOT NULL DEFAULT '',
        `username` varchar(45) NOT NULL,
        `password` varchar(45) NOT NULL,
        PRIMARY KEY (`manager_id`)
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8;*/