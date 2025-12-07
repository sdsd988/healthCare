package healthmanage.healthcare.service;

import healthmanage.healthcare.dto.request.WorkerSearchRequest;
import healthmanage.healthcare.dto.response.AfterCareResponse;
import healthmanage.healthcare.dto.WorkerListDto;
import healthmanage.healthcare.repository.AfterCareRepository;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class AfterCareService {

  private final AfterCareRepository afterCareRepository;


  private static final List<WorkerListDto> workerDummyStore = new ArrayList<>();

  public List<AfterCareResponse> findAfterCareResults(WorkerSearchRequest workerSearchRequest) {
    LocalDateTime now = LocalDateTime.now();

    return Arrays.asList(
        new AfterCareResponse(
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
        new AfterCareResponse(
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
        new AfterCareResponse(
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
        new AfterCareResponse(
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

}
