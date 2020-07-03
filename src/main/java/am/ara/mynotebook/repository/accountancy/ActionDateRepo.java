package am.ara.mynotebook.repository.accountancy;

import am.ara.mynotebook.entity.accountancy.ActionDateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActionDateRepo extends JpaRepository<ActionDateEntity, Integer> {
}
