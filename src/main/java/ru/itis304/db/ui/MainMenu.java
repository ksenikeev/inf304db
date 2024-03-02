package ru.itis304.db.ui;

import org.w3c.dom.ls.LSOutput;
import ru.itis304.db.service.IIncomeService;
import ru.itis304.db.service.ISpendingService;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainMenu {

    private Scanner scanner;
    private IIncomeService incomeService;
    private ISpendingService spendingService;

    public MainMenu() {
        Scanner scanner = new Scanner(System.in);
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
        int p = scanner.nextInt();
        System.out.println("1. Просмотр всех доходов\n" +
                "2. Просмотр всех расходов\n" +
                "3. Просмотр всех доходов за период\n" +
                "4. Просмотр всех расходов за период\n" +
                "5. Добавление новой позиции по доходу\n" +
                "6. Добавление новой позиции по расходу\n" +
                "7. Подведение итогов за период (доходы - расходы), доходы, расходы\n");
        while (true) {
            switch (scanner.nextInt()){
                case 1: showAllIncome();
                    break;
                case 2:
                    shawAllSpending();
                    break;
                case 3:
                    System.out.println("Введите даты начала и конца отсчета  в формате yyyy-MM-dd");
                    showAllIncomePeriod(scanner.nextLine(),scanner.nextLine());
                    break;
                case 4:
                    System.out.println("Введите даты начала и конца отсчета в формате yyyy-MM-dd");
                    shawAllSpendingPeriod(scanner.nextLine(),scanner.nextLine());
                    break;
                case 5:
                    addIncomeData();
                    break;
                case 6:
                    addSpendingData();
                    break;
                case 7:
                    showBalance();
                    showIncomeSum();
                    showSpendingSum();
                    break;
                default: System.out.println();
            }

        }
    }

    private void showAllIncome() {
        System.out.println("all income = " + incomeService.getAll());
//        for (int i = 0; i < incomeService.getAll().size(); i++) {
//            System.out.println(incomeService.getAll().toArray()[i]);
//        }
    }
    private void shawAllSpending() {}
    private void showAllIncomePeriod(String dateFrom, String dateTo) {
        for (int i = 0; i < incomeService.getAllByPeriod(dateFrom,dateTo).size();i ++){
            System.out.println(String.valueOf(i+1) + incomeService.getAllByPeriod(dateFrom,dateTo).toArray()[i]);
        }
    }
    private void shawAllSpendingPeriod(String dateFrom,String dateTo) {
        for (int i = 0; i < spendingService.getAllByPeriod(dateFrom,dateTo).size();i ++){
            System.out.println(String.valueOf(i+1) + spendingService.getAllByPeriod(dateFrom,dateTo).toArray()[i]);
        }
    }
    private void addIncomeData() {}
    private void addSpendingData() {}
    private void showBalance() {}
    private void showIncomeSum() {}
    private void showSpendingSum() {}

}
