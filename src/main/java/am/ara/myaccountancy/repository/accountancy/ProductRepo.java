package am.ara.myaccountancy.repository.accountancy;

import am.ara.myaccountancy.entity.accountancy.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<ProductEntity, Integer> {
}
