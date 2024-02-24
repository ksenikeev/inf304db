package ru.itis304.db.service;

import ru.itis304.db.model.Spending;
import ru.itis304.db.model.SpendingData;
import java.util.List;

public interface ISpendingService {

    Spending getSpending();
    /** через репозиторий загружаем все расходы */
    void loadSpending();
    /** через репозиторий сохраняем все расходы */
    void save();
    void addSpending(String date, Float sum, int spendingCode, String description);
    List<SpendingData> getAll();
    List<SpendingData> getAllByPeriod(String dateFrom, String dateTo);
    Float getSumByPeriod(String dateFrom, String dateTo);
}
