package ru.itis304.db.ui;

import ru.itis304.db.model.SpendingData;
import ru.itis304.db.model.SpendingType;
import ru.itis304.db.service.IIncomeService;
import ru.itis304.db.service.SpendingService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MainMenu {

    private Scanner scanner;
    private IIncomeService incomeService;
    private SpendingService spendingService;

    public MainMenu() {
        scanner = new Scanner(System.in);
        // иннициализация сервисов
        start();
    }

    /** Безин */
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

    /** Сагадиева */
    private void showAllIncome() {}
    /** Кононенко */
    private void shawAllSpending() {}
    /** Петунин */
    private void showAllIncomePeriod() {}
    /** Закиров */
    private void shawAllSpendingPeriod() {}
    /** Арманов */
    private void addIncomeData() {}
    /** Ахметов */
    private void addSpendingData() throws ParseException, IllegalStateException {
        scanner = new Scanner(System.in);
        System.out.println("Set time in format: yyyy-MM-dd HH:mm");
        Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm")
                .parse(scanner.nextLine());
        System.out.println("Set sum:");
        Float sum = scanner.nextFloat();
        System.out.println("Select a category from the list:\n" +
                "1. Market\n" +
                "2. Transport\n" +
                "3. Service\n" +
                "4. Education\n" +
                "5. Entertainment");
        SpendingType category;

        switch (scanner.nextInt()) {
            case 1:
                category = SpendingType.Market;
                break;
            case 2:
                category = SpendingType.Transport;
                break;
            case 3:
                category = SpendingType.Service;
                break;
            case 4:
                category = SpendingType.Education;
                break;
            case 5:
                category = SpendingType.Entertainment;
                break;
            default:
                throw new IllegalStateException("Unexpected value");
        }
        System.out.println("Write a description:");
        String description = scanner.nextLine();
        scanner.close();

        SpendingData spendingData = new SpendingData(date, sum, category, description);

        spendingService.save(spendingData);
    }
    /** Хайруллов */
    private void showBalance() {}
    /** Кадырова */
    private void showIncomeSum() {}
    /** Сабирзянов */
    private void showSpendingSum() {}

}
