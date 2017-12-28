package scu.mtsp.domain;

import java.util.Date;

/**
 * @Author:qinsenlin Description:
 * @Date: created in 21:41 2017/12/27
 * @Modified By:
 */
public class AnswerDetailStu {
  private Integer id;
  private Integer userId;
  private Integer examId;
  private String answer;
  private Integer score;
  private Date createTime;
  public AnswerDetailStu() {
  }

  public AnswerDetailStu(Integer userId, Integer examId, String answer, Integer score, Date createTime) {
    this.userId = userId;
    this.examId = examId;
    this.answer = answer;
    this.score = score;
    this.createTime = createTime;
  }


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Integer getExamId() {
    return examId;
  }

  public void setExamId(Integer examId) {
    this.examId = examId;
  }

  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }

  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  @Override
  public String toString() {
    return "AnswerDetailStu{" +
            "id=" + id +
            ", userId=" + userId +
            ", examId=" + examId +
            ", answer='" + answer + '\'' +
            ", score=" + score +
            ", createTime=" + createTime +
            '}';
  }
}
