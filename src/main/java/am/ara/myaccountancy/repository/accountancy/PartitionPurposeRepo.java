package am.ara.myaccountancy.repository.accountancy;

import am.ara.myaccountancy.entity.accountancy.PartitionPurposeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartitionPurposeRepo extends JpaRepository<PartitionPurposeEntity, Integer> {
}
