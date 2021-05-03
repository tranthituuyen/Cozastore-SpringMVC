package vn.edu.nlu.api.admin;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.edu.nlu.constant.URLConstant;
import vn.edu.nlu.dto.ProductDTO;

@RestController(value = "productAPIOfAdmin")
public class ProductAPI {

    @PostMapping(URLConstant.API_PRODUCT)
    public ProductDTO createProduct(@RequestBody ProductDTO productDTO) {

        return productDTO;
    }

    @PutMapping(URLConstant.API_PRODUCT)
    public ProductDTO updateProduct(@RequestBody ProductDTO productDTO) {
        return productDTO;
    }

    @DeleteMapping(URLConstant.API_PRODUCT)
    public void deleteProduct(@RequestBody long[] ids) {
        System.out.println("ok");
    }
}
