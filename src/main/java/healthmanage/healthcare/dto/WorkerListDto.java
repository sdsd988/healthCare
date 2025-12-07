package healthmanage.healthcare.dto;

import healthmanage.healthcare.domain.Worker;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WorkerListDto {

  private Long workerId;
  private String workerName;      // 환자명
  private String occupation;      // 발령직군
  private String department;      // 부서

  // 건강 등급 필드 (최신 HealthExamination 또는 별도 평가 엔티티에서 가져온다고 가정)
  private String generalHealthGrade;      // 일반건강검진 등급
  private String brainHeartGrade;         // 뇌심평가 등급
  private String musculoskeletalGrade;    // 근골격계 질환 등급
  private String specialHealthGrade;      // 특수 건강검진 등급
  private boolean hasHealthConsultation;  // 보건상담 유무 (AfterCare 존재 여부로 판단 가정)

  // 등록일 (Worker 엔티티에 해당 필드가 없으므로, 생성 시간을 사용한다고 가정)
  private LocalDateTime registrationDate;

  // 생성자 (Worker와 등급 정보를 받아 DTO를 생성)
  public WorkerListDto(Worker worker, String genGrade, String bhGrade, String msGrade,
      String spGrade, boolean hasConsultation) {
    this.workerId = worker.getWorkerId();
    this.workerName = worker.getWorkerName();
    this.occupation = worker.getOccupation();
    this.department = worker.getDepartment();
    // registrationDate는 임의로 현재 시간을 사용하거나 Worker 엔티티에 추가 필드가 필요
    this.registrationDate = LocalDateTime.now();

    // 등급 정보
    this.generalHealthGrade = genGrade;
    this.brainHeartGrade = bhGrade;
    this.musculoskeletalGrade = msGrade;
    this.specialHealthGrade = spGrade;
    this.hasHealthConsultation = hasConsultation;

  }

}
