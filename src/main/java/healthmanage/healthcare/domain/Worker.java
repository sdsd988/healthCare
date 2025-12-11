package healthmanage.healthcare.domain;

import healthmanage.healthcare.domain.aftercare.GeneralCheckup;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Entity
@Getter
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "worker_id")
    private Long workerId;

    //이름
    @Column(name = "name", length = 255, nullable = false)
    private String name;

    //기관
    @Column(name = "institution", length = 255, nullable = false)
    private String institution;

    //직무
    @Column(name = "occupation", length = 255, nullable = false)
    private String occupation;

    //부서
    @Column(name = "department", length = 255, nullable = false)
    private String department;

    //생년월일
    @Column(name = "birth_date", length = 255, nullable = false)
    private String birthDate;

    //성병
    @Column(name = "gender", length = 50)
    private String gender;

    //근무형태
    @Column(name = "work_type", length = 255, nullable = false)
    private String workType;

    // Worker 1명 → 건강검진 여러개
    @OneToMany(mappedBy = "worker", cascade = CascadeType.ALL, orphanRemoval = false)
    private List<GeneralCheckup> generalCheckups;

}
