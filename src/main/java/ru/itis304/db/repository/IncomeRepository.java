package ru.itis304.db.repository;

import ru.itis304.db.model.Income;

/**
 * Методы загружают и сохраняют данные в файл
 */
public interface IncomeRepository {

    Income getAll();

    void save(Income income);

}
