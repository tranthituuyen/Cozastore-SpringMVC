package vn.edu.nlu.dao;

import vn.edu.nlu.model.CategoryModel;

import java.util.List;

public interface ICategoryDAO extends GenericDAO<CategoryModel> {
    List<CategoryModel> findAll();

    CategoryModel findOne(Integer id);

    CategoryModel findOne(String code);

    Integer save(CategoryModel categoryModel);

    void update(CategoryModel updateCategoryModel);

    void delete(int id);

    int countProduct(String code);
}
