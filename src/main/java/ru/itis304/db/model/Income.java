package ru.itis304.db.model;

import java.util.List;

public class Income {
    private List<IncomeData> income;

    public List<IncomeData> getIncome() {
        return income;
    }

    public void setIncome(List<IncomeData> income) {
        this.income = income;
    }
}
