package ru.itis304.db.service;

import ru.itis304.db.model.Spending;
import ru.itis304.db.model.SpendingData;
import ru.itis304.db.repository.SpendingRepository;
import java.util.List;

public interface SpendingService {

    public void addSpending(String date, Float sum, int spendingCode, String description) {

    }

    public List<SpendingData> getAll() {
        return null;
    }

    public List<SpendingData> getAllByPeriod(String dateFrom, String dateTo) {
        return null;
    }

    public Float getSumByPeriod(String dateFrom, String dateTo) {
        return null;
    }
}
