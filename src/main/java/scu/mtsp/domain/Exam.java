package scu.mtsp.domain;

import java.util.Date;

public class Exam {
  private Integer id;
  private String name;
  private String answer;
  private Date createTime;

    public Exam() {
    }

    public Exam(String name, String answer, Date createTime) {
        this.name = name;
        this.answer = answer;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", answer='" + answer + '\'' +
                ", createTime=" + createTime +
                '}';
    }

}
