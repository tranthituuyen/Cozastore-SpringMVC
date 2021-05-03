package vn.edu.nlu.dao.impl;

import vn.edu.nlu.dao.ICategoryDAO;
import vn.edu.nlu.mapper.CategoryMapper;
import vn.edu.nlu.model.CategoryModel;

import java.util.List;

public class CategoryDAO extends AbstractDAO<CategoryModel> implements ICategoryDAO {

    @Override
    // find all categories
    public List<CategoryModel> findAll() {
        String sql = "SELECT * FROM danhmuc";
        return query(sql, new CategoryMapper());
    }

    @Override
    // find category with specified id
    public CategoryModel findOne(Integer id) {
        String sql = "SELECT * FROM danhmuc WHERE id = ?";
        List<CategoryModel> categoryModel = query(sql, new CategoryMapper(), id);
        return categoryModel.isEmpty() ? null : categoryModel.get(0);
    }

    @Override
    // find category with specified code
    public CategoryModel findOne(String code) {
        String sql = "SELECT * FROM danhmuc WHERE madanhmuc = ?";
        List<CategoryModel> categoryModel = query(sql, new CategoryMapper(), code);
        return categoryModel.isEmpty() ? null : categoryModel.get(0);
    }

    @Override
    // add new category
    public Integer save(CategoryModel categoryModel) {
        StringBuilder sql = new StringBuilder("INSERT INTO danhmuc (madanhmuc, tendanhmuc, createddate, createdby )");
        sql.append("VALUES (?, ?, ?, ?)");

        return insert(sql.toString(), categoryModel.getCode(), categoryModel.getName(),
                categoryModel.getCreatedDate(), categoryModel.getCreatedBy());
    }

    @Override
    public void update(CategoryModel updateCategoryModel) {
        StringBuilder sql = new StringBuilder("UPDATE danhmuc SET madanhmuc = ?, tendanhmuc = ?, ");
        sql.append("createddate = ?, createdby = ?, modifieddate = ?, modifiedby = ? ");
        sql.append("WHERE id  = ?");

        update(sql.toString(), updateCategoryModel.getCode(), updateCategoryModel.getName(),
                updateCategoryModel.getCreatedDate(), updateCategoryModel.getCreatedBy(), updateCategoryModel.getModifiedDate(),
                updateCategoryModel.getModifiedBy(), updateCategoryModel.getId());
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM danhmuc WHERE id = ?";
        update(sql, id);
    }

    @Override
    public int countProduct(String code) {
        String sql = "SELECT COUNT(*) FROM sanpham WHERE madanhmuc = ?";
        return count(sql, code);
    }
}
