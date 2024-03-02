package ru.itis304.db.repository;

import ru.itis304.db.model.SpendingData;

import java.util.List;

import java.io.IOException;

/**
 * Методы загружают и сохраняют данные в файл
 */
public interface SpendingRepository {

    /** Кириллин */
    List<SpendingData> findAll();

    /** Иванов */
    void save(SpendingData spendingData);

    List<SpendingData> findByPeriod(String dateFrom, String dateTo);
}
