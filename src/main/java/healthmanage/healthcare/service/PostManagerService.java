package healthmanage.healthcare.service;

import healthmanage.healthcare.dto.request.WorkerSearchRequest;
import healthmanage.healthcare.dto.response.PostManagerDetailResponse;
import healthmanage.healthcare.dto.response.PostManagerResponse;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class PostManagerService {




  public List<PostManagerResponse> findAfterCareResults(WorkerSearchRequest workerSearchRequest) {
    LocalDateTime now = LocalDateTime.now();

    return Arrays.asList(
        new PostManagerResponse(
            1L,
            "강영구",
            "일반직",
            "왕송호수레저팀",
            "A",
            "고",
            "D",
            "A",
            true, // 상담 있음
            now.minusDays(5)
        ),
        new PostManagerResponse(
            2L,
            "김민우",
            "공무직",
            "교통시설팀",
            "C",
            "고",
            "D",
            "B",
            false, // 상담 없음
            now.minusDays(10)
        ),
        new PostManagerResponse(
            3L,
            "김상진",
            "일반직",
            "포일스포츠센터팀",
            "A",
            "고",
            "C",
            "D",
            true, // 상담 있음
            now.minusDays(1)
        ),
        new PostManagerResponse(
            4L,
            "김재훈",
            "일반직",
            "바라산휴양림팀",
            "D",
            "고",
            "D",
            "A",
            false, // 상담 없음
            now.minusDays(15)
        )
    );
  }

  public PostManagerDetailResponse getPostManagerDetail(Long workerId) {
    PostManagerDetailResponse detailDTO = new PostManagerDetailResponse();


    //
    // 2. 직원 기본 정보

      detailDTO.setWorkerId(1L);
      detailDTO.setName("강영구");
      detailDTO.setDepartment("왕송호수팀");
      detailDTO.setOccupation("일반직");

      return detailDTO;
  }
}
