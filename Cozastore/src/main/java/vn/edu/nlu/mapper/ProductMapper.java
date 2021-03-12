package vn.edu.nlu.mapper;

import vn.edu.nlu.model.Product;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet resultSet) {
        Product product = new Product();
        try {
            product.setId(resultSet.getInt("id"));
            product.setCode(resultSet.getString("code"));
            product.setName(resultSet.getString("name"));
            product.setCategoryCode(resultSet.getString("category_code"));
            product.setPrice(resultSet.getInt("price"));
            product.setCover(resultSet.getString("cover"));
            product.setSex(resultSet.getString("sex"));
            product.setDescription(resultSet.getString("description"));
            product.setDetails(resultSet.getString("details"));
            product.setStatus(resultSet.getBoolean("status"));
            product.setCreatedDate(resultSet.getTimestamp("created_date"));
            product.setCreatedBy(resultSet.getString("created_by"));

            if (resultSet.getTimestamp("modified_date") != null) {
                product.setModifiedDate(resultSet.getTimestamp("modified_date"));
            }
            if (resultSet.getString("modified_by") != null) {
                product.setModifiedBy(resultSet.getString("modified_by"));
            }
            return product;
        } catch (SQLException e) {
            return null;
        }
    }
}
