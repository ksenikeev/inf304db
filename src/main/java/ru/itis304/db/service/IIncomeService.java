package ru.itis304.db.service;

import ru.itis304.db.model.Income;
import ru.itis304.db.model.IncomeData;
import java.util.List;

public interface IIncomeService {

    Income getIncome();
    /** через репозиторий загружаем все расходы */
    void loadIncome();
    /** через репозиторий сохраняем все расходы */
    void save();
    void addIncome(String date, Float sum, int spendingCode, String description);
    List<IncomeData> getAll();
    List<IncomeData> getAllByPeriod(String dateFrom, String dateTo);
    Float getSumByPeriod(String dateFrom, String dateTo);
}
