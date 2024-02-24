package ru.itis304.db.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru.itis304.db.model.Income;
import ru.itis304.db.model.IncomeData;
import ru.itis304.db.service.IncomeService;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IncomeRepositoryBody implements IncomeRepository {
    ObjectMapper objectMapper = new ObjectMapper();
    public IncomeRepositoryBody(){}
    @Override
    public Income getAll() {
        Income income = null;
        try {
            income = objectMapper.readValue(new File("income.json"), Income.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return income;
    }

    @Override
    public void save(Income income) {

    }
}
