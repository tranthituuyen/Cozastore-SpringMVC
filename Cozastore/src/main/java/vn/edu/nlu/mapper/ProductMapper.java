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
            product.setCategoryCode(resultSet.getString("categorycode"));
            product.setPrice(resultSet.getInt("price"));
            product.setCover(resultSet.getString("cover"));
            product.setSex(resultSet.getString("sex"));
            product.setDescription(resultSet.getString("description"));
            product.setDetails(resultSet.getString("details"));
            product.setStatus(resultSet.getBoolean("status"));
            product.setCreatedDate(resultSet.getTimestamp("createddate"));
            product.setCreatedBy(resultSet.getString("createdby"));

            if (resultSet.getTimestamp("modifieddate") != null) {
                product.setModifiedDate(resultSet.getTimestamp("modifieddate"));
            }
            if (resultSet.getString("modifiedby") != null) {
                product.setModifiedBy(resultSet.getString("modifiedby"));
            }
            return product;
        } catch (SQLException e) {
            return null;
        }
    }
}
