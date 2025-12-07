package healthmanage.healthcare.domain.aftercare;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class GeneralHealth {


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long generalCheckupId;


}
