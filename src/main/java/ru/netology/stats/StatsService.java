package ru.netology.stats;

public class StatsService {
    public long calcualteSum(long[] sales ) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;  // Сумму всех продаж
    }

    public long AverageSale(long[] sales) {
        long sum = 0;
        long months = 0;
        long AverageSale = 0;
        for (long sale : sales) {
            months += 1;
            sum += sale;
            AverageSale = sum / months;
        }
        return AverageSale; // Среднюю сумму продаж в месяц
    }

    public long bestSalesMonth(long[] sales) {
        long currentMax = sales[0];
        long monthsNumber = 0;
        long monthsNumberMax = 0;
        for (long sale : sales) {
            monthsNumber += 1;
            if (currentMax <= sale) {
                currentMax = sale;
                monthsNumberMax = monthsNumber;
            }
        }
        return monthsNumberMax; // Номер месяца, в котором был пик продаж
    }

    public long WorseSalesMonths(long[] sales) {
        long currentMin = sales[0];
        long monthsNumber = 0;
        long monthsNumberMin = 0;
        for (long sale : sales) {
            monthsNumber += 1;
            if (currentMin >= sale) {
                currentMin = sale;
                monthsNumberMin = monthsNumber;
            }
        }
        return monthsNumberMin; // Номер месяца, в котором был минимум продаж
    }

    public long monthsSalesUnderAverage(long[] sales) {
        long sum = 0;
        long months = 0;
        for (long sale : sales) {
            months +=1;
            sum += sale;
        }
        long AverageSale = sum / months;
        long currentMonthSales;
        long monthsNumber = 0;
        for (long sale : sales) {
            currentMonthSales = sale;
            if (currentMonthSales < AverageSale) {
                monthsNumber += 1;
            }
        }
        return monthsNumber; // Количество месяцев, в которых продажи были ниже среднего
    }

    public long monthsSalesOverAverage(long[] sales) {
        long sum = 0;
        long months = 0;
        for (long sale : sales) {
            months +=1;
            sum += sale;
        }
        long AverageSale = sum / months;
        long currentMonthSales;
        long monthsNumber = 0;
        for (long sale : sales) {
            currentMonthSales = sale;
            if (currentMonthSales > AverageSale) {
                monthsNumber +=1;
            }
        }
        return monthsNumber; // Количество месяцев, в которых продажи были выше среднего
    }
}
