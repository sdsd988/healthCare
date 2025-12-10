package healthmanage.healthcare.repository;

import healthmanage.healthcare.domain.PostManagerReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AfterCareRepository extends JpaRepository<PostManagerReport, Long> {

}
