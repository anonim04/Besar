package sample.model;

import java.sql.Date;
import java.util.UUID;

public class Database {
    int id;
    String about;
    double income;
    double spending;
    int createBy;
    Date createdAt;
    Date modifiedAt;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getAbout() {
        return about;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getIncome() {
        return income;
    }

    public void setSpending(double spending) {
        this.spending = spending;
    }

    public double getSpending() {
        return spending;
    }

    public void setCreateBy(int createBy) {
        this.createBy = createBy;
    }

    public int getCreateBy() {
        return createBy;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public Date getModifiedAt() {
        return modifiedAt;
    }
}
