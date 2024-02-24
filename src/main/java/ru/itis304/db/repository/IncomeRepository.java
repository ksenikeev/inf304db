package ru.itis304.db.repository;

import ru.itis304.db.model.Income;

/**
 * Методы загружают и сохраняют данные в файл
 */
public interface IncomeRepository {

    /** Бикмухаметов */
    Income getAll();

    /** Салижанов */
    void save(Income income);

}
