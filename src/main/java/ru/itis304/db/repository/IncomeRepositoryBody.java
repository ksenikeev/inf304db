package ru.itis304.db.repository;

import ru.itis304.db.model.Income;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class IncomeRepositoryBody implements IncomeRepository {
    ObjectMapper mapper = new ObjectMapper();
    @Override
    public Income getAll() {
        return null;
    }

    @Override
    public void save(Income income) {
        try {
            mapper.writeValue(new File("income.json"), income);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
