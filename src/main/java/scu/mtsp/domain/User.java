package scu.mtsp.domain;

/**
 * @Author:qinsenlin Description:
 * @Date: created in 21:39 2017/12/27
 * @Modified By:
 */
public class User {
    private Integer id;
    private String loginname;
    private String username;
    private String password;
    private Integer age;
    private String gender;
    private String school;
    private String grade;
    private String email;

    public User() {
    }

    public User(String loginname, String username, String password, Integer age, String gender, String school, String grade, String email) {
        this.loginname = loginname;
        this.username = username;
        this.password = password;
        this.age = age;
        this.gender = gender;
        this.school = school;
        this.grade = grade;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", loginname='" + loginname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", school='" + school + '\'' +
                ", grade='" + grade + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
