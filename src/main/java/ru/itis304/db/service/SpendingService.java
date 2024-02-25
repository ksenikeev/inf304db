package ru.itis304.db.service;

import ru.itis304.db.model.SpendingData;

import java.util.List;

public interface SpendingService {

    void save(SpendingData spendingData);

    List<SpendingData> findAll();

    List<SpendingData> findByPeriod(String dateFrom, String dateTo);

    Float getSumByPeriod(String dateFrom, String dateTo);
}
