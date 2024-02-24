package ru.itis304.db.repository;

import ru.itis304.db.model.Spending;

/**
 * Методы загружают и сохраняют данные в файл
 */
public interface SpendingRepository {

    Spending getAll();

    void save(Spending income);

}
