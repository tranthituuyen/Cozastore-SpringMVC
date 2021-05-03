package vn.edu.nlu.model;

import java.io.Serializable;

public class CategoryModel extends AbstractModel<CategoryModel> implements Serializable {
    private String code;
    private String name;
    private int numberOfProduct;

    public CategoryModel() {}

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfProduct() {
        return numberOfProduct;
    }

    public void setNumberOfProduct(int numberOfProduct) {
        this.numberOfProduct = numberOfProduct;
    }
}