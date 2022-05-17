package ru.netology.stats;

public class StatsService {

    public int sum(int[] sales) {

        int sum = 0;
        for (int sale : sales) {
            sum += sale;

        }
        return sum;
    }

    public double avr(double[] sales) {

        double avr = 0;
        for (double sale : sales) {
            avr += sale / 12;

        }
        return avr;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int indexMonth = 0;
        for (int sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = indexMonth;
            }
            indexMonth = indexMonth + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int indexMonth = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = indexMonth;
            }
            indexMonth = indexMonth + 1;
        }
        return minMonth + 1;
    }

    public double upAVR(double[] sales) {

        double upMonths = 0;
        for (double sale : sales) {
            if (sale > avr(sales)) {
                upMonths = upMonths + 1;
            }


        }
        return upMonths;
    }

    public double undAVR(double[] sales) {

        double undMonths = 0;
        for (double sale : sales) {
            if (sale < avr(sales)) {
                undMonths = undMonths + 1;
            }


        }
        return undMonths;
    }
}
