package ru.itis304.db.service;

import ru.itis304.db.model.Income;
import ru.itis304.db.model.IncomeData;
import ru.itis304.db.model.Spending;
import ru.itis304.db.model.SpendingData;
import ru.itis304.db.repository.IncomeRepository;
import ru.itis304.db.repository.SpendingRepository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IncomeService implements IIncomeService {

    private IncomeRepository repository;
    private static Income income;

    /** инициализация репозитория */
    public IncomeService() {
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

    public List<IncomeData> getAllByPeriod(String dateFrom, String dateTo){
        List<IncomeData> list = new ArrayList<>();
        Date datefrom = null;
        Date dateto = null;
        try {
            datefrom = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(dateFrom);
            dateto = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(dateTo);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        for (IncomeData incomeData : income.getIncome()) {
            if (incomeData.getDate().after(datefrom) & incomeData.getDate().before(dateto)) {
                list.add(incomeData);
            }
        }
        return list;
    }

    public Float getSumByPeriod(String dateFrom, String dateTo) {
        return null;
    }
}
