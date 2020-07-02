package am.ara.myaccountancy.repository.accountancy;

import am.ara.myaccountancy.entity.accountancy.CashAccessEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CashAccessRepo extends JpaRepository<CashAccessEntity, Integer> {
}
