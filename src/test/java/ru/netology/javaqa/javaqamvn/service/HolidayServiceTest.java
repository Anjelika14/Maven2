package ru.netology.javaqa.javaqamvn.service;

import org.junit.jupiter.api.Test;

public class HolidayServiceTest {
    @Test
    public void shouldCalculate() {
        HolidayService service = new HolidayService();
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        long actual = service.calculate(income, expenses);
        int expected = 3;
        ;
    }
}



