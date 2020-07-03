package am.ara.mynotebook.repository.accountancy;

import am.ara.mynotebook.entity.accountancy.PartitionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartitionRepo extends JpaRepository<PartitionEntity, Integer> {
}
