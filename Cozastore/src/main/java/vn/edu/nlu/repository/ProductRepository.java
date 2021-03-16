package vn.edu.nlu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.nlu.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

}
