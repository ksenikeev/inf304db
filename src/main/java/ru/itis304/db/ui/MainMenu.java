package ru.itis304.db.ui;

import ru.itis304.db.service.IIncomeService;
import ru.itis304.db.service.SpendingService;
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
    private void shawAllSpending() {
//        System.out.println(Arrays.toString(spendingService.getAll().toArray()));//1
//        System.out.println(spendingService.getAll());//2

        for (int i = 0; i < spendingService.findAll().size(); i++) {//3
            System.out.println(String.valueOf(i+1) + spendingService.findAll().toArray()[i]);
        }
    }
    /** Петунин */
    private void showAllIncomePeriod() {}
    /** Закиров */
    private void shawAllSpendingPeriod() {}
    /** Арманов */
    private void addIncomeData() {}
    /** Ахметов */
    private void addSpendingData() {}
    /** Хайруллов */
    private void showBalance() {}
    /** Кадырова */
    private void showIncomeSum() {}
    /** Сабирзянов */
    private void showSpendingSum() {}

}
