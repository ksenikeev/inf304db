package ru.itis304.db.repository;

import ru.itis304.db.model.SpendingData;

import java.util.List;

/**
 * Методы загружают и сохраняют данные в файл
 */
public interface SpendingRepository {

    /** Кириллин */
    List<SpendingData> getAll();

    /** Иванов */
    void save(SpendingData spendingData);
}
