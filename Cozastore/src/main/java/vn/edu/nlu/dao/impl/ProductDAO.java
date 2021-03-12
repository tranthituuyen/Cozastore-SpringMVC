package vn.edu.nlu.dao.impl;

import org.springframework.stereotype.Repository;
import vn.edu.nlu.dao.IProductDAO;
import vn.edu.nlu.mapper.ProductMapper;
import vn.edu.nlu.model.Product;

import java.util.List;

@Repository
public class ProductDAO extends AbstractDAO<Product> implements IProductDAO {

    @Override
    public List<Product> findAll() {
        String sql = "SELECT * FROM product";
        return query(sql, new ProductMapper());
    }
}
