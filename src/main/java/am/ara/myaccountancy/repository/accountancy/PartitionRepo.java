package am.ara.myaccountancy.repository.accountancy;

import am.ara.myaccountancy.entity.accountancy.PartitionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartitionRepo extends JpaRepository<PartitionEntity, Integer> {
}
