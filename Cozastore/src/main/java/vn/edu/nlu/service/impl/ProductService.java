package vn.edu.nlu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.edu.nlu.dto.ProductDTO;
import vn.edu.nlu.entity.ProductEntity;
import vn.edu.nlu.repository.ProductRepository;
import vn.edu.nlu.service.IProductService;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService implements IProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductDTO> findAll(Pageable pageable) {
        List<ProductDTO> models = new ArrayList<>();
        List<ProductEntity> entities = productRepository.findAll(pageable).getContent();
        for (ProductEntity item : entities) {
            ProductDTO productDTO = new ProductDTO();
            productDTO.setCode(item.getCode());
            productDTO.setName(item.getName());
            productDTO.setCategoryCode(item.getCategory().getName());
            productDTO.setPrice(item.getPrice());
            productDTO.setCover(item.getCover());
            models.add(productDTO);
        }
        return models;
    }

    @Override
    public int getTotalItem() {
        return (int) productRepository.count();
    }
}
