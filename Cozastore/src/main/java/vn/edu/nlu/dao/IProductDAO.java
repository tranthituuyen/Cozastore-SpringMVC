package vn.edu.nlu.dao;

import vn.edu.nlu.model.ProductModel;

import java.util.List;

public interface IProductDAO extends GenericDAO<ProductModel> {

    List<ProductModel> findAll();

}
