package ru.itis304.db.ui;

import ru.itis304.db.service.IIncomeService;
import ru.itis304.db.service.ISpendingService;
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
    private void addIncomeData() {}
    private void addSpendingData() {}
    private void showBalance() {}
    private void showIncomeSum() {}
    private void showSpendingSum() {}

}
