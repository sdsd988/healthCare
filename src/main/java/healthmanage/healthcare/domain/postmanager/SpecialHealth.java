package healthmanage.healthcare.domain.postmanager;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SpecialHealth {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long specialCheckupId;


}
