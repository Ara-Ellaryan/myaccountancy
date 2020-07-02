package am.ara.myaccountancy.repository.accountancy;

import am.ara.myaccountancy.entity.accountancy.TradeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TradeRepo extends JpaRepository<TradeEntity, Integer> {
}
