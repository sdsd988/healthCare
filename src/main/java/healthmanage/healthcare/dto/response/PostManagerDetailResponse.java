package healthmanage.healthcare.dto.response;

import healthmanage.healthcare.domain.converter.SmokingConverter;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PostManagerDetailResponse {

    // 1. 직원 정보
    Long workerId;
    String name;
    String department;
    String occupation;

    // 2. 일반건강검진 정보
    List<GeneralCheckupDetailResponse> generalCheckupDetail;

    //3. 특수건간강검진 정보
    List<SpecialCheckupDetailResponse> specialCheckupDetail;



}
