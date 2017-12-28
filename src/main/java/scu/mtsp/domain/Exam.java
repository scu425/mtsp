package scu.mtsp.domain;

import java.util.Date;

public class Exam {
  private Integer id;
  private String whichPlan;
  private String round;
  private String answer;
  private Date createTime;

    public Exam() {
    }


    public Exam(String whichPlan, String round, String answer, Date createTime) {
        this.whichPlan = whichPlan;
        this.round = round;
        this.answer = answer;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWhichPlan() {
        return whichPlan;
    }

    public void setWhichPlan(String whichPlan) {
        this.whichPlan = whichPlan;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
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
                ", whichPlan='" + whichPlan + '\'' +
                ", round='" + round + '\'' +
                ", answer='" + answer + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
