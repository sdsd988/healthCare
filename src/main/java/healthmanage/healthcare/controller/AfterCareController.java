package healthmanage.healthcare.controller;

import healthmanage.healthcare.dto.request.WorkerSearchRequest;
import healthmanage.healthcare.dto.response.PostManagerDetailResponse;
import healthmanage.healthcare.dto.response.PostManagerResponse;
import healthmanage.healthcare.service.AfterCareService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/aftercare")
@RequiredArgsConstructor
public class AfterCareController {

  private final AfterCareService afterCareService;

  @GetMapping("/list")
  public String listHealthResults(WorkerSearchRequest searchRequest, Model model) {
    // 1. 서비스 호출 및 검색 결과 가져오기
    List<PostManagerResponse> results = afterCareService.findAfterCareResults(searchRequest);

    // 2. 검색 결과를 모델에 담기
    model.addAttribute("results", results);

    // 3. ✨핵심 수정: 검색 조건을 "search"라는 이름으로 모델에 명시적으로 다시 담아,
    //    HTML에서 th:object로 안전하게 바인딩할 수 있도록 합니다. (오류 방지)
    model.addAttribute("search", searchRequest);
    return "aftercare/list";
  }

  @GetMapping("/detail/{workerId}")
  public String afterCareDetail(@PathVariable Long workerId, Model model) {

    PostManagerDetailResponse response = afterCareService.getPostManagerDetail(workerId);

    // 2. 모델에 DTO 추가
    model.addAttribute("detail", response);
    return "aftercare/detail";
  }

}
