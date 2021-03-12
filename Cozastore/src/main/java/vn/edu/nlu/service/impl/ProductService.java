package vn.edu.nlu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.nlu.dao.IProductDAO;
import vn.edu.nlu.model.Product;
import vn.edu.nlu.service.IProductService;

import java.util.List;

@Service
public class ProductService implements IProductService {

    @Autowired
    private IProductDAO productDAO;

    @Override
    public List<Product> findAll() {
        return productDAO.findAll();
    }
}
