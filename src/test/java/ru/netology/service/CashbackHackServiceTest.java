package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateCashbackFrom2000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1200);
        int expected = 800;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateCashback1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateCashback0() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);
    }
}
