package am.ara.mynotebook.repository.accountancy;

import am.ara.mynotebook.entity.accountancy.SourceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SourceRepo extends JpaRepository<SourceEntity, Integer> {
}
