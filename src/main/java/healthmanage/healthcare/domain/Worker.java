package healthmanage.healthcare.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Entity
@Getter
public class Worker {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long workerId;

  private String name;

  private String occupation;

  private String department;

  private String birthDate;

  private String gender;

  private String field;

  private String workerType;

  @OneToMany(mappedBy = "worker", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<PostManagerReport> postManagerReports = new ArrayList<>(); // 컬렉션 타입 및 이름 수정



}
