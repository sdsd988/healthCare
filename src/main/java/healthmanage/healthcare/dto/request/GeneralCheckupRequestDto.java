package healthmanage.healthcare.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GeneralCheckupRequestDto {

  // 기본 정보
  private String workerName;          // 직원명
  private String department;          // 부서
  private String occupation;          // 직무

  // 일반건강검진 결과
  private String generalCheckupGrade; // 종합등급 (A, B, C, D)
  private String bloodPressure;       // 혈압(mmHg)
  private String bloodSugar;          // 혈당
  private String cholesterol;         // 콜레스테롤
  private String findings;            // 유소견 사항

  // 사후관리
  private String workFit;             // 작업 적합성
  private Boolean hasHealthConsultation; // 보건상담 여부 (true/false)
  private String doctorOpinion;       // 의사 소견
}