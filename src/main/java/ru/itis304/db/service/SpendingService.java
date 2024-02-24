package ru.itis304.db.service;

import ru.itis304.db.model.SpendingData;

import java.util.List;

public interface SpendingService {

    void save(SpendingData spendingData);

    List<SpendingData> getAll();

    List<SpendingData> getAllByPeriod(String dateFrom, String dateTo);

    Float getSumByPeriod(String dateFrom, String dateTo);
}
