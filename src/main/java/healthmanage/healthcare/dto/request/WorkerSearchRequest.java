package healthmanage.healthcare.dto.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class WorkerSearchRequest {

  // 1. 문자열 검색 조건
  private String workerName;      // 환자명
  private String department;      // 부서

  // 2. 등급 조건
  private String generalGrade;      // 일반건강검진 등급
  private String specialGrade;      // 특수 건강검진 등급
  private String bhGrade;           // 뇌심평가 등급
  private String msGrade;           // 근골격계 질환 등급

  // 3. Boolean 조건 (HTML 폼에서 "true", "false" 문자열로 넘어옴)
  private Boolean hasConsultation;  // 보건상담 유무

}
