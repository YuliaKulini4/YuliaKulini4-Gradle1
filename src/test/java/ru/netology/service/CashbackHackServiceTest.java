package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnAmountToCashBackZero() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 5000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
            }
    @Test
    public void shouldReturnAmountToCashBackZeroBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldReturnAmountToCashBackPositive() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 500;
        int actual = cashbackHackService.remain(amount);
        int expected = 500;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldReturnAmountToCashBackEqualBoundary () {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;
        int actual = cashbackHackService.remain(amount);
        int expected = 1000;
        assertEquals(expected, actual);
    }
}


