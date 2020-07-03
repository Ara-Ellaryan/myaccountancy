package am.ara.mynotebook.repository.accountancy;

import am.ara.mynotebook.entity.accountancy.MoneyDistributionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoneyDistributionRepo extends JpaRepository<MoneyDistributionEntity, Integer> {
}
