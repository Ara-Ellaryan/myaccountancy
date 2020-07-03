package am.ara.mynotebook.repository.accountancy;

import am.ara.mynotebook.entity.accountancy.CashAccessEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CashAccessRepo extends JpaRepository<CashAccessEntity, Integer> {
}
