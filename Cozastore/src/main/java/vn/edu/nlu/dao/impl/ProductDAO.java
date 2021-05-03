package vn.edu.nlu.dao.impl;

import org.springframework.stereotype.Repository;
import vn.edu.nlu.dao.IProductDAO;
import vn.edu.nlu.mapper.ProductMapper;
import vn.edu.nlu.model.ProductModel;

import java.util.List;

@Repository
public class ProductDAO extends AbstractDAO<ProductModel> implements IProductDAO {

    @Override
    public List<ProductModel> findAll() {
        String sql = "SELECT * FROM product";
        return query(sql, new ProductMapper());
    }
}
