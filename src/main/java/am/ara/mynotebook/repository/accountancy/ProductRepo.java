package am.ara.mynotebook.repository.accountancy;

import am.ara.mynotebook.entity.accountancy.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<ProductEntity, Integer> {
}
