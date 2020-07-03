package am.ara.mynotebook.repository.accountancy;

import am.ara.mynotebook.entity.accountancy.ActionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActionRepo extends JpaRepository<ActionEntity, Integer> {
}
