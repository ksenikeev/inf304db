package ru.itis304.db.service;

import ru.itis304.db.model.Income;
import ru.itis304.db.model.IncomeData;
import ru.itis304.db.model.IncomeType;
import ru.itis304.db.repository.IncomeRepository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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

    /** Тюшин */
    public void addIncome(IncomeData incomeData, String date, Float sum, IncomeType incomeType, String description) throws ParseException {
        incomeData.setDate(new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(date));
        incomeData.setSum(sum);
        incomeData.setCategory(incomeType);
        incomeData.setDescription(description);

        getAll().add(incomeData);
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
