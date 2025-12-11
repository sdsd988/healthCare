package healthmanage.healthcare.domain.postmanager;

import healthmanage.healthcare.domain.Worker;
import healthmanage.healthcare.domain.converter.SmokingConverter;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class GeneralCheckup {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "general_checkup_id")
    private Long generalCheckupId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "worker_id", nullable = false)
    private Worker worker;

    // 고혈압등급
    @Column(name = "high_blood_pressure_grade")
    private String highBloodPressureGrade;  // 고혈압등급

    @Column(name = "diastolic")
    private String diastolic;               // 이완기혈압수치

    @Column(name = "systolic")
    private String systolic;                // 수축기혈압수치

    @Column(name = "lipidGrade")
    private String lipidGrade;              // 이상지질등급

    @Column(name = "totalCholesterol")
    private String totalCholesterol;        // 총콜레스테롤

    @Column(name = "triglyceride")
    private String triglyceride;            // 중성지방

    @Column(name = "hdl")
    private String hdl;                     // HDL

    @Column(name = "ldl")
    private String ldl;                     // LDL

    @Column(name = "kidney_disease_grade")
    private String kidneyDiseaseGrade;      // 신장질환등급

    @Column(name = "urine_protein")
    private String urineProtein;            // 요단백

    @Column(name = "gfr")
    private String gfr;                     // 사구체여과율

    @Column(name = "creatinine")
    private String creatinine;              // 크레아틴

    @Column(name = "obesity_grade")
    private String obesityGrade;            // 비만등급

    @Column(name = "waist")
    private String waist;                   // 허리둘레

    @Column(name = "bmi")
    private String bmi;                     // 체질량지수

    @Convert(converter = SmokingConverter.class)
    @Column(name = "smoking")
    private String smoking;                 // 흡연여부

    @Column(name = "fasting_blood_sugar")
    private String fastingBloodSugar;       // 공복혈당

    @Column(name = "remarkCode")
    private String remarkCode;              // 소견번호

    @Column(name = "examYear")
    private String examYear;                // 검진년도
}
