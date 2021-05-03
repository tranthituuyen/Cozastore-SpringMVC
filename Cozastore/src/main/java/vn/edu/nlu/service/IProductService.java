package vn.edu.nlu.service;

import org.springframework.data.domain.Pageable;
import vn.edu.nlu.dto.ProductDTO;

import java.util.List;

public interface IProductService {
    List<ProductDTO> findAll(Pageable pageable);
    int getTotalItem();
}
