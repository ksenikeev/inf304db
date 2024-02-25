package ru.itis304.db.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class SpendingData {
    @JsonFormat
            (shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm")
    private Date date;
    private Float sum;
    private SpendingType category;
    private String description;

    public SpendingData() {}

    public SpendingData(Date date, Float sum, SpendingType category, String description) {
        this.date = date;
        this.sum = sum;
        this.category = category;
        this.description = description;
    }

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

    public SpendingType getCategory() {
        return category;
    }

    public void setCategory(SpendingType category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
