package healthmanage.healthcare.repository;

import healthmanage.healthcare.domain.postmanager.GeneralCheckup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeneralCheckupRepository extends JpaRepository<GeneralCheckup,Long> {
}
