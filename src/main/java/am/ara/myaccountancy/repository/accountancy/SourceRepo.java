package am.ara.myaccountancy.repository.accountancy;

import am.ara.myaccountancy.entity.accountancy.SourceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SourceRepo extends JpaRepository<SourceEntity, Integer> {
}
