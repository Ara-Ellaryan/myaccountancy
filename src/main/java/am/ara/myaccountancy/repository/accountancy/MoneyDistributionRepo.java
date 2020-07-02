package am.ara.myaccountancy.repository.accountancy;

import am.ara.myaccountancy.entity.accountancy.MoneyDistributionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoneyDistributionRepo extends JpaRepository<MoneyDistributionEntity, Integer> {
}
