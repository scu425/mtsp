package scu.mtsp.domain;

/**
 * @Author:qinsenlin Description:
 * @Date: created in 21:41 2017/12/27
 * @Modified By:
 */
public class AnswerDetailStu {
  private Integer id;
  private Integer stuId;
  private Integer examId;
  private String answer;
  private Integer score;

  public AnswerDetailStu() {
  }

  public AnswerDetailStu(Integer stuId, Integer examId, String answer, Integer score) {
    this.stuId = stuId;
    this.examId = examId;
    this.answer = answer;
    this.score = score;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getStuId() {
    return stuId;
  }

  public void setStuId(Integer stuId) {
    this.stuId = stuId;
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

  @Override
  public String toString() {
    return "AnswerDetailStu{" +
            "id=" + id +
            ", stuId=" + stuId +
            ", examId=" + examId +
            ", answer='" + answer + '\'' +
            ", score=" + score +
            '}';
  }
}
