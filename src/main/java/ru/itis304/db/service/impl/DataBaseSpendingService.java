package ru.itis304.db.service.impl;

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
        repository.save(spendingData);
    }

    @Override
    public List<SpendingData> findAll() {
        return repository.findAll();
    }

    @Override
    public List<SpendingData> findByPeriod(String dateFrom, String dateTo) {
        return repository.findByPeriod(dateFrom, dateTo);
    }

    @Override
    public Float getSumByPeriod(String dateFrom, String dateTo) {
        return findByPeriod(dateFrom, dateTo).stream()
                .map(SpendingData::getSum)
                .reduce(Float::sum)
                .orElse(0f);
    }
}
