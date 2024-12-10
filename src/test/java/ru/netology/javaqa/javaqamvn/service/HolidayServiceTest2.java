package ru.netology.javaqa.javaqamvn.service;

import org.junit.jupiter.api.Test;

public class HolidayServiceTest2 {

@Test
public void shouldCalculate2() {
    HolidayService service = new HolidayService();
    int income = 100000;
    int expenses = 60000;
    int threshold = 150000;
    long actual = service.calculate(income, expenses);
    int expected = 2;
    ;
}
}
