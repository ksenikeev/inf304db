package ru.itis304.db.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru.itis304.db.model.Income;
import ru.itis304.db.model.IncomeData;
import ru.itis304.db.model.IncomeType;
import ru.itis304.db.repository.IncomeRepositoryBody;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class TestLoad {
    public static void main(String[] args) throws ParseException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Income income = objectMapper.readValue(new File("income.json"), Income.class);
        System.out.println(income);

        IncomeRepositoryBody irp = new IncomeRepositoryBody();
        System.out.println(irp.getAll());
    }
}
