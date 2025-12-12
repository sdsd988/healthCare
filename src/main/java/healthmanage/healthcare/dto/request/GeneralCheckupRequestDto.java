package healthmanage.healthcare.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GeneralCheckupRequestDto {

    // 기본 정보
    String workerName;          // 직원명
    String department;          // 부서
    String occupation;          // 직무
    String birthDate;           // 생년월일
    String gender;              // 성별
    String workType;            // 근무형태


    // 일반건강검진 결과
    String highBloodPressureGrade;  // 혈압
    String diastolic;               // 이완기혈압수치
    String systolic;                // 수축기혈압수치
    String lipidGrade;              // 이상지질
    String totalCholesterol;        // 총콜레스테롤
    String triglyceride;            // 중성지방
    String hdl;                     // HDL
    String ldl;                     // LDL
    String kidneyDiseaseGrade;      // 신장질환등급
    String urineProtein;            // 요단백
    String gfr;                     // 사구체여과율
    String creatinine;              // 크레아틴
    String obesityGrade;            // 비만등급
    String waist;                   // 허리둘레
    String bmi;                     // 체질량지수
    String smokingYn;               // 흡연여부
    String drunkenYn;               // 음주여부
    String fastingBloodSugar;       // 공복혈당
    String examYear;                // 검진년도
    String diabetesGrade;           // 당뇨
    String liverDiseaseGrade;        // 간질환등급
    String ast;                     // AST
    String alt;                     // ALT
    String gtp;                     // GTP
}