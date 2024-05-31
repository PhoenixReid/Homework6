package ru.netology.stats;

public class StatsService {

    public int TheAmountOfSales(int[] sales) {
        int summa = 0;
        for (int i = 0; i < sales.length; i++) {
            summa = summa + sales[i];

        }
        return summa;
    }

    public int AverageSales(int[] sales) {
        int summa = 0;
        int avg = 0;

        for (int i = 0; i < sales.length; i++) {
            summa = summa + sales[i];
        }
        avg = summa / sales.length;
        return avg;
    }

    public int MinimumSales(int[] sales) {
        int MinMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[MinMonth]) {
                MinMonth = i;
            }
        }
        return MinMonth + 1;
    }

    public int MaximumSales(int[] sales) {
        int MaxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[MaxMonth]) {
                MaxMonth = i;
            }
        }
        return MaxMonth + 1;
    }

    public int SmallerAverageSales(int[] sales) {
        int summa = 0;
        int avg = 0;
        int MinAvg = 0;

        for (int i = 0; i < sales.length; i++) {
            summa = summa + sales[i];
        }
        avg = summa / sales.length;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avg) {
                MinAvg++;
            }
        }
        return MinAvg;
    }

    public int LargeAverageSales(int[] sales) {
        int summa = 0;
        int avg = 0;
        int MaxAvg = 0;

        for (int i = 0; i < sales.length; i++) {
            summa = summa + sales[i];
        }
        avg = summa / sales.length;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avg) {
                MaxAvg++;
            }
        }
        return MaxAvg;
    }
}


