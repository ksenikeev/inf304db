package ru.itis304.db.json;

import ru.itis304.db.model.Income;
import ru.itis304.db.model.IncomeData;
import ru.itis304.db.model.IncomeType;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestSave {
    public static void main(String[] args) throws ParseException, IOException {
        Income income = new Income();

        List<IncomeData> incomeDataList = new ArrayList<>();

        IncomeData incomeData = new IncomeData();
        incomeData.setDate(
                new SimpleDateFormat("yyyy-MM-dd HH:mm")
                        .parse("2024-02-24 10:51"));
        incomeData.setSum(1000f);
        incomeData.setCategory(IncomeType.Salary);
        incomeData.setDescription("Зарплата");

        incomeDataList.add(incomeData);

        income.setIncome(incomeDataList);

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("income.json"), income);
    }
}
