package ru.itis304.db.service;

import ru.itis304.db.model.Spending;
import ru.itis304.db.model.SpendingData;
import ru.itis304.db.repository.SpendingRepository;
import java.util.List;

public class SpendingService implements ISpendingService {

    private SpendingRepository repository;
    private static Spending spending;

    /** инициализация репозитория */
    public SpendingService() {
    }

    /** через репозиторий загружаем все расходы */
    public void loadSpending() {

    }

    /** через репозиторий сохраняем все расходы */
    public void save() {

    }

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
