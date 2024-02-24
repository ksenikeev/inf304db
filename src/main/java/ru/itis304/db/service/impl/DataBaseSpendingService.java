package ru.itis304.db.service.impl;

import ru.itis304.db.model.Spending;
import ru.itis304.db.model.SpendingData;
import ru.itis304.db.repository.SpendingRepository;
import ru.itis304.db.service.SpendingService;

import java.util.List;

/**
 * @author Denys Patsera
 */
public class DataBaseSpendingService implements SpendingService {

    private final SpendingRepository repository;

    public DataBaseSpendingService(SpendingRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(SpendingData spendingData) {
        repository.save(new Spending());
    }

    @Override
    public List<SpendingData> getAll() {
        return null;
    }

    @Override
    public List<SpendingData> getAllByPeriod(String dateFrom, String dateTo) {
        return null;
    }

    @Override
    public Float getSumByPeriod(String dateFrom, String dateTo) {
        return null;
    }
}
