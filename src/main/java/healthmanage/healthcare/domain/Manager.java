package healthmanage.healthcare.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Manager {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long managerId;

  private String managerName;

  private String institution;

  private String department;

  private String birthDate;
}
