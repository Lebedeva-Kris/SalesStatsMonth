package ru.netology.stats;

public class StatsService {

    public int calculateSumForAllMonths(int[]sales){
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
       }

    public int calculateAverage(int[]sales){
        int average = calculateSumForAllMonths(sales) / sales.length;

        return average;
    }

    public int findMonthWithMaxSales(int[]sales){
        int currentMax = sales[0];
        int numberOfMonthWithMaxSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= currentMax) {
                currentMax = sales[i];
                numberOfMonthWithMaxSales = i + 1;
            }
        }
        return numberOfMonthWithMaxSales;
        }

    public int findMonthWithMinSales(int[]sales){
        int currentMin = sales[0];
        int numberOfMonthWithMinSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= currentMin) {
                currentMin = sales[i];
                numberOfMonthWithMinSales = i + 1;
            }
        }
        return numberOfMonthWithMinSales;
    }

    public int findMonthsWithSalesBellowAverage(int[]sales){
        int averageSales = calculateAverage(sales);
        int monthsBellowAverage = 0;
        for (int sale : sales) {
            if (sale < averageSales) {
                monthsBellowAverage++;
            }
        }
        return monthsBellowAverage;
    }

    public int findMonthsWithSalesOverAverage(int[]sales){
        int averageSales = calculateAverage(sales);
        int monthsAboveAverage = 0;
        for (int sale : sales) {
            if (sale > averageSales) {
                monthsAboveAverage++;
            }
        }
        return monthsAboveAverage;
    }
    }




