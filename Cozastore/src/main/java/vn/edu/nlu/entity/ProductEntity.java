package vn.edu.nlu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "product")
public class ProductEntity extends BaseEntity implements Serializable {

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "categorycode")
    private String categoryCode;

    @Column(name = "price")
    private int price;

    @Column(name = "sex")
    private String sex;

    @Column(name = "cover")
    private String cover;

    @Column(name = "description")
    private String description;

    @Column(name = "details")
    private String details;

    @Column(name = "status")
    private boolean status;

    public ProductEntity() {

    }

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

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
