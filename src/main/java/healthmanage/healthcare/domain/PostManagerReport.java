package healthmanage.healthcare.domain;

import healthmanage.healthcare.domain.aftercare.BrainHealth;
import healthmanage.healthcare.domain.aftercare.GeneralHealth;
import healthmanage.healthcare.domain.aftercare.Musculoskeletal;
import healthmanage.healthcare.domain.aftercare.SpecialHealth;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class PostManagerReport {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long postManagerId;

  private Integer issueYear; // 발행년도 (예: 2024)

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "worker_id")
  private Worker worker;

  @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  @JoinColumn(name = "general_checkup_id")
  private GeneralHealth generalHealth;

  @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  @JoinColumn(name = "special_checkup_id")
  private SpecialHealth specialHealth;

  @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  @JoinColumn(name = "musculoskeletal_id")
  private Musculoskeletal musculoskeletal;

  @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  @JoinColumn(name = "cardiovascular_id")
  private BrainHealth brainHealth;
}
