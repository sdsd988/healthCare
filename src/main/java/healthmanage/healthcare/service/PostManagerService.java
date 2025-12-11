package healthmanage.healthcare.service;

import healthmanage.healthcare.domain.postmanager.GeneralCheckup;
import healthmanage.healthcare.dto.request.WorkerSearchRequest;
import healthmanage.healthcare.dto.response.GeneralCheckupDetailResponse;
import healthmanage.healthcare.dto.response.PostManagerDetailResponse;
import healthmanage.healthcare.dto.response.PostManagerResponse;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import healthmanage.healthcare.repository.GeneralCheckupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class PostManagerService {

  private final GeneralCheckupRepository generalCheckupRepository;


  public List<PostManagerResponse> findAfterCareResults(WorkerSearchRequest workerSearchRequest) {
    LocalDateTime now = LocalDateTime.now();

    return Arrays.asList(
        new PostManagerResponse(
            1L,
            "강영구",
            "일반직",
            "왕송호수레저팀",
            "A",
            "최고",
            "D",
            "A",
            true, // 상담 있음
            now.minusDays(5),
            "A"
        ),
        new PostManagerResponse(
            2L,
            "김민우",
            "공무직",
            "교통시설팀",
            "C",
            "중등도",
            "D",
            "B",
            false, // 상담 없음
            now.minusDays(10),
            "B"
        ),
        new PostManagerResponse(
            3L,
            "김상진",
            "일반직",
            "포일스포츠센터팀",
            "A",
            "중등도",
            "C",
            "D",
            true, // 상담 있음
            now.minusDays(1),
            "C"
        ),
        new PostManagerResponse(
            4L,
            "김재훈",
            "일반직",
            "바라산휴양림팀",
            "D",
            "중등도",
            "D",
            "A",
            false, // 상담 없음
            now.minusDays(15),
            "D"
        )
    );
  }

  public static PostManagerDetailResponse createTestList() {

    // 1. 건강검진 세부 리스트
    GeneralCheckupDetailResponse checkup1 =
        GeneralCheckupDetailResponse.builder()
            .highBloodPressureGrade("A")
            .diastolic("80")
            .systolic("120")
            .lipidGrade("B")
            .totalCholesterol("180")
            .triglyceride("150")
            .hdl("55")
            .ldl("90")
            .kidneyDiseaseGrade("A")
            .urineProtein("N")
            .gfr("95")
            .creatinine("0.8")
            .obesityGrade("정상")
            .waist("82")
            .bmi("22.3")
            .smoking("N")          // Y/N
            .fastingBloodSugar("90")
            .examYear("2024")
            .diabetesGrade("C")
            .build();

    GeneralCheckupDetailResponse checkup2 =
        GeneralCheckupDetailResponse.builder()
            .highBloodPressureGrade("B")
            .diastolic("85")
            .systolic("130")
            .lipidGrade("C")
            .totalCholesterol("200")
            .triglyceride("170")
            .hdl("50")
            .ldl("110")
            .kidneyDiseaseGrade("A")
            .urineProtein("N")
            .gfr("90")
            .creatinine("0.9")
            .obesityGrade("과체중")
            .waist("88")
            .bmi("24.8")
            .smoking("Y")          // Y/N
            .fastingBloodSugar("100")
            .examYear("2025")
            .diabetesGrade("D2")
            .build();

    // 2. 근로자 + 건강검진 Response
    PostManagerDetailResponse response = new PostManagerDetailResponse();
    response.setWorkerId(1L);
    response.setName("강영구");
    response.setDepartment("일반직");
    response.setOccupation("왕송호수레저팀");
    response.setGeneralCheckupDetail(List.of(checkup1, checkup2));

    return response;
  }

  public PostManagerDetailResponse getPostManagerDetail(Long workerId) {

    return createTestList();
  }
}
