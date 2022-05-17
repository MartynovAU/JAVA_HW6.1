package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void Sum() {
        StatsService stats = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = stats.sum(sales);
        int expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Avr() {
        StatsService stats = new StatsService();

        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        double actual = stats.avr(sales);
        double expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void FindMaxSales() {
        StatsService stats = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = stats.maxSales(sales);
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void FindMinSales() {
        StatsService stats = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = stats.minSales(sales);
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void FindUpAVR() {
        StatsService stats = new StatsService();

        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        double actual = stats.upAVR(sales);
        double expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void FindUnderAVR() {
        StatsService stats = new StatsService();

        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        double actual = stats.undAVR(sales);
        double expected = 5;
        Assertions.assertEquals(expected, actual);
    }
}

