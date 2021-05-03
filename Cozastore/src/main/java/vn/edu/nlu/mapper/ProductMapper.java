package vn.edu.nlu.mapper;

import vn.edu.nlu.model.ProductModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper implements RowMapper<ProductModel> {
    @Override
    public ProductModel mapRow(ResultSet resultSet) {
        ProductModel productModel = new ProductModel();
        try {
            productModel.setId(resultSet.getInt("id"));
            productModel.setCode(resultSet.getString("code"));
            productModel.setName(resultSet.getString("name"));
            productModel.setCategoryCode(resultSet.getString("categorycode"));
            productModel.setPrice(resultSet.getInt("price"));
            productModel.setCover(resultSet.getString("cover"));
            productModel.setSex(resultSet.getString("sex"));
            productModel.setDescription(resultSet.getString("description"));
            productModel.setDetails(resultSet.getString("details"));
            productModel.setStatus(resultSet.getBoolean("status"));
            productModel.setCreatedDate(resultSet.getTimestamp("createddate"));
            productModel.setCreatedBy(resultSet.getString("createdby"));

            if (resultSet.getTimestamp("modifieddate") != null) {
                productModel.setModifiedDate(resultSet.getTimestamp("modifieddate"));
            }
            if (resultSet.getString("modifiedby") != null) {
                productModel.setModifiedBy(resultSet.getString("modifiedby"));
            }
            return productModel;
        } catch (SQLException e) {
            return null;
        }
    }
}
