package ru.itis304.db.repository;

import ru.itis304.db.model.Spending;

import java.io.IOException;

/**
 * Методы загружают и сохраняют данные в файл
 */
public interface SpendingRepository {

    Spending getAll();

    void save(Spending income);

}
