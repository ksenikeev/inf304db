package ru.itis304.db.ui;

import ru.itis304.db.model.IncomeData;
import ru.itis304.db.model.IncomeType;
import ru.itis304.db.model.SpendingType;
import ru.itis304.db.service.IIncomeService;
import ru.itis304.db.service.ISpendingService;
import ru.itis304.db.service.IncomeService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.IllformedLocaleException;
import java.util.Scanner;

public class MainMenu {

    private Scanner scanner;
    private IIncomeService incomeService;
    private ISpendingService spendingService;

    public MainMenu() {
        scanner = new Scanner(System.in);
        // иннициализация сервисов
        start();
    }

    private void start() {
        /**
         * принимаем команды:
         * 1. Просмотр всех доходов
         * 2. Просмотр всех расходов
         * 3. Просмотр всех доходов за период
         * 4. Просмотр всех раходов за период
         * 5. добавление новой позиции по доходу
         * 6. добавление новой позиции по расходу
         * 7. Подведение итогов за период (доходы - расходы), доходы, расходы
         * */
        while (true) {

        }
    }

    private void showAllIncome() {}
    private void shawAllSpending() {}
    private void showAllIncomePeriod() {}
    private void shawAllSpendingPeriod() {}
    private void addIncomeData() throws ParseException{
        scanner = new Scanner(System.in);
        System.out.println("Set time in format: yyyy-MM-dd HH:mm");
        Date date = new SimpleDateFormat("yyy-MM-dd HH:mm").parse(scanner.nextLine());
        System.out.println("Set sum: ");
        Float sum = scanner.nextFloat();
        System.out.println("Select a category from the list:\n" +
                "1. Donate\n" +
                "2. Salary\n" +
                "3. Transaction\n");
        IncomeType category;
        switch (scanner.nextInt()){
            case 1:
                category = IncomeType.Donate;
                break;
            case 2:
                category = IncomeType.Salary;
                break;
            case 3:
                category = IncomeType.Transaction;
                break;
            default:
                throw new IllformedLocaleException("Unexpected value");
        }
        System.out.println("Write a description: ");
        String description = scanner.nextLine();
        scanner.close();

        IncomeData incomeData = new IncomeData(date, sum, category, description);

        incomeService.save(incomeData);
    }
    private void addSpendingData(){}
    private void showBalance() {}
    private void showIncomeSum() {}
    private void showSpendingSum() {}

}
