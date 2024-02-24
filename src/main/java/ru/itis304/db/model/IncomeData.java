package ru.itis304.db.model;

import java.util.Date;

public class IncomeData {
    private Date date;
    private Float sum;
    private IncomeType category;
    private String description;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Float getSum() {
        return sum;
    }

    public void setSum(Float sum) {
        this.sum = sum;
    }

    public IncomeType getCategory() {
        return category;
    }

    public void setCategory(IncomeType category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
