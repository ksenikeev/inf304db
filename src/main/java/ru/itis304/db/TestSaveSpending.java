package ru.itis304.db;

import ru.itis304.db.model.Spending;
import ru.itis304.db.model.SpendingData;
import ru.itis304.db.model.SpendingType;
import ru.itis304.db.repository.SpendingRepos;
import ru.itis304.db.repository.SpendingRepository;

import java.util.ArrayList;
import java.util.Date;

public class TestSaveSpending {
    public void test() {
        ArrayList<SpendingData> spendingDataList = new ArrayList<>();

        Date now = new Date();
        SpendingData spendingData = new SpendingData();
        spendingData.setSum(50F);
        spendingData.setCategory(SpendingType.Market);
        spendingData.setDate(now);
        spendingData.setDescription("rpkdgjskjfgdss");

        SpendingData spendingData2 = new SpendingData();
        spendingData2.setSum(1265F);
        spendingData2.setCategory(SpendingType.Education);
        spendingData2.setDate(now);
        spendingData2.setDescription("fdfgfstjftj");

        spendingDataList.add(spendingData);
        spendingDataList.add(spendingData2);

        Spending spending = new Spending();
        spending.setSpending(spendingDataList);


        SpendingRepository repository = new SpendingRepos();
        repository.save(spending);
    }
}
