package am.ara.myaccountancy.repository.accountancy;

import am.ara.myaccountancy.entity.accountancy.ActionDateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActionDateRepo extends JpaRepository<ActionDateEntity, Integer> {
}
