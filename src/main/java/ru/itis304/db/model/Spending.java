package ru.itis304.db.model;

import java.util.List;

public class Spending {
    private List<SpendingData> spending;

    public List<SpendingData> getSpending() {
        return spending;
    }

    public void setSpending(List<SpendingData> spending) {
        this.spending = spending;
    }
}
