package ru.netology.stats;

public class StatsService {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    public static int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public static int calculateAverage(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int findMax(int[] sales) {
        int currentMax = sales[0];
        int number = 0;
        int numberMax = 0;
        for (int sale : sales) {
            number++;
            if (currentMax <= sale) {
                currentMax = sale;
                numberMax = number;
            }
        }
        return numberMax;
    }

    public int findMin(int[] sales) {
        int currentMin = sales[0];
        int number = 0;
        int numberMin = 0;
        for (int sale : sales) {
            number++;
            if (currentMin >= sale) {
                currentMin = sale;
                numberMin = number;
            }
        }
        return numberMin;
    }

    public int quantityMonthUnderAverage(int[] sales) {
        int average = calculateAverage(sales);
        int quantity = 0;
        int quantityUnder = 0;
        for (int sale : sales) {
            if (sale < average) {
                quantityUnder++;
            }

        }
        return quantityUnder;
    }

    public int quantityMonthOverAverage(int[] sales) {
        int average = calculateAverage(sales);
        int quantity = 0;
        int quantityOver = 0;
        for (int sale : sales) {
            if (sale > average) {
                quantityOver++;
            }
        }
        return quantityOver;
    }
}



