package am.ara.myaccountancy.repository.accountancy;

import am.ara.myaccountancy.entity.accountancy.ProductCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCategoryRepo extends JpaRepository<ProductCategoryEntity, Integer> {
}
