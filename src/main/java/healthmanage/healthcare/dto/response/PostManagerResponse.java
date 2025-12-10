package healthmanage.healthcare.dto.response;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostManagerResponse {

  private Long workerId;
  private String workerName;      // 환자명
  private String occupation;      // 발령직군
  private String department;      // 부서

  private String generalHealthGrade;      // 일반건강검진 등급
  private String brainHeartGrade;         // 뇌심평가 등급
  private String musculoskeletalGrade;    // 근골격계 질환 등급
  private String specialHealthGrade;      // 특수 건강검진 등급
  private boolean hasHealthConsultation;  // 보건상담 유무 (CounsellingLog 존재 여부로 판단 가정)

  private LocalDateTime registrationDate;


  public PostManagerResponse(Long workerId, String workerName, String occupation, String department,
      String generalHealthGrade, String brainHeartGrade, String musculoskeletalGrade,
      String specialHealthGrade, boolean hasHealthConsultation, LocalDateTime registrationDate) {
    this.workerId = workerId;
    this.workerName = workerName;
    this.occupation = occupation;
    this.department = department;
    this.generalHealthGrade = generalHealthGrade;
    this.brainHeartGrade = brainHeartGrade;
    this.musculoskeletalGrade = musculoskeletalGrade;
    this.specialHealthGrade = specialHealthGrade;
    this.hasHealthConsultation = hasHealthConsultation;
    this.registrationDate = registrationDate;
  }
}
