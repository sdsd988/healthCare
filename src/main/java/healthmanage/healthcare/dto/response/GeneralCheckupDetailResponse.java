package healthmanage.healthcare.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GeneralCheckupDetailResponse {

    String highBloodPressureGrade;  // 고혈압등급
    String diastolic;               // 이완기혈압수치
    String systolic;                // 수축기혈압수치
    String lipidGrade;              // 이상지질등급
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
    String smoking;                 // 흡연여부
    String fastingBloodSugar;       // 공복혈당
    String examYear;                // 검진년도

    @Builder
    public GeneralCheckupDetailResponse(String highBloodPressureGrade, String diastolic, String systolic, String lipidGrade, String totalCholesterol, String triglyceride, String hdl, String ldl, String kidneyDiseaseGrade, String urineProtein, String gfr, String creatinine, String obesityGrade, String waist, String bmi, String smoking, String fastingBloodSugar,String examYear) {
        this.highBloodPressureGrade = highBloodPressureGrade;
        this.diastolic = diastolic;
        this.systolic = systolic;
        this.lipidGrade = lipidGrade;
        this.totalCholesterol = totalCholesterol;
        this.triglyceride = triglyceride;
        this.hdl = hdl;
        this.ldl = ldl;
        this.kidneyDiseaseGrade = kidneyDiseaseGrade;
        this.urineProtein = urineProtein;
        this.gfr = gfr;
        this.creatinine = creatinine;
        this.obesityGrade = obesityGrade;
        this.waist = waist;
        this.bmi = bmi;
        this.smoking = smoking;
        this.fastingBloodSugar = fastingBloodSugar;
        this.examYear = examYear;
    }
}
