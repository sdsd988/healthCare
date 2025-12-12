package healthmanage.healthcare.repository;

import healthmanage.healthcare.domain.postmanager.GeneralCheckup;
import healthmanage.healthcare.domain.postmanager.SpecialCheckup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialCheckupRepository extends JpaRepository<SpecialCheckup,Long> {
}
