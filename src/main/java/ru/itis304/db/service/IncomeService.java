package ru.itis304.db.service;

import ru.itis304.db.model.Income;
import ru.itis304.db.model.IncomeData;
import ru.itis304.db.model.Spending;
import ru.itis304.db.model.SpendingData;
import ru.itis304.db.repository.IncomeRepository;
import ru.itis304.db.repository.SpendingRepository;

import java.util.List;

public class IncomeService implements IIncomeService {

    private IncomeRepository repository;
    private static Income income;

    /** инициализация репозитория */
    public IncomeService() {
    }

    @Override
    public Income getIncome() {
        return null;
    }

    /** через репозиторий загружаем все расходы */
    public void loadIncome() {

    }

    /** через репозиторий сохраняем все расходы */
    public void save() {

    }

    public void addIncome(String date, Float sum, int spendingCode, String description) {

    }

    public List<IncomeData> getAll() {
        return null;
    }

    public List<IncomeData> getAllByPeriod(String dateFrom, String dateTo) {
        return null;
    }

    public Float getSumByPeriod(String dateFrom, String dateTo) {
        return null;
    }
}
