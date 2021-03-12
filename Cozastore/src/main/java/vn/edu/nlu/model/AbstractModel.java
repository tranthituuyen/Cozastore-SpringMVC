package vn.edu.nlu.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class AbstractModel<T> {
    private Integer id;
    private Timestamp createdDate;
    private Timestamp modifiedDate;
    private String createdBy;
    private String modifiedBy;
    private int[] ids;
    private List<T> listResult = new ArrayList<>();
//    private Integer page = 1;
//    private Integer maxPageItem = 10;
//    private Integer totalPage;
//    private Integer totalItem;
//    private String sortName;
//    private String sortBy;
//    private String alert;
//    private String message;
//    private String type = "list";

    public Integer getId() {
        return id;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public Timestamp getModifiedDate() {
        return modifiedDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public int[] getIds() {
        return ids;
    }

    public List<T> getListResult() {
        return listResult;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public void setModifiedDate(Timestamp modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public void setIds(int[] ids) {
        this.ids = ids;
    }

    public void setListResult(List<T> listResult) {
        this.listResult = listResult;
    }
}
