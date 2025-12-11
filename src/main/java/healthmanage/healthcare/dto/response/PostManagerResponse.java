package healthmanage.healthcare.dto.response;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostManagerResponse {

     Long workerId;
     String workerName;      // 근로자명
     String occupation;      // 발령직군
     String department;      // 부서

     String generalCheckupGrade;      // 일반건강검진 등급
     String brainHeartGrade;         // 뇌심평가 등급
     String musculoskeletalGrade;    // 근골격계 질환 등급
     String specialHealthGrade;      // 특수 건강검진 등급
    String remarkCode;              // 소견번호

     boolean hasHealthConsultation;  // 보건상담 유무 (CounsellingLog 존재 여부로 판단 가정)

     LocalDateTime registrationDate;


    @Builder
    public PostManagerResponse(Long workerId, String workerName, String occupation, String department,
                               String generalCheckupGrade, String brainHeartGrade, String musculoskeletalGrade,
                               String specialHealthGrade, boolean hasHealthConsultation, LocalDateTime registrationDate,String remarkCode) {
        this.workerId = workerId;
        this.workerName = workerName;
        this.occupation = occupation;
        this.department = department;
        this.generalCheckupGrade = generalCheckupGrade;
        this.brainHeartGrade = brainHeartGrade;
        this.musculoskeletalGrade = musculoskeletalGrade;
        this.specialHealthGrade = specialHealthGrade;
        this.hasHealthConsultation = hasHealthConsultation;
        this.registrationDate = registrationDate;
        this.remarkCode = remarkCode;
    }
}
