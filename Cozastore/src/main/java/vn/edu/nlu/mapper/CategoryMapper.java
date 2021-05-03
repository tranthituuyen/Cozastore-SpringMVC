package vn.edu.nlu.mapper;

import vn.edu.nlu.model.CategoryModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryMapper implements RowMapper<CategoryModel> {

    @Override
    public CategoryModel mapRow(ResultSet resultSet) {
        try {
            CategoryModel categoryModel = new CategoryModel();
            categoryModel.setId(resultSet.getInt("id"));
            categoryModel.setCode(resultSet.getString("madanhmuc"));
            categoryModel.setName(resultSet.getString("tendanhmuc"));
            categoryModel.setCreatedDate(resultSet.getTimestamp("createddate"));
            categoryModel.setCreatedBy(resultSet.getString("createdby"));

            if (resultSet.getTimestamp("modifieddate") != null) {
                categoryModel.setModifiedDate(resultSet.getTimestamp("modifieddate"));
            }
            if (resultSet.getString("modifiedby") != null) {
                categoryModel.setModifiedBy(resultSet.getString("modifiedby"));
            }
            return categoryModel;
        } catch (SQLException e) {
            return null;
        }
    }
}
