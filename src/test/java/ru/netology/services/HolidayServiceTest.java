package ru.netology.services;

import org.junit.jupiter.api.Test;

public class HolidayServiceTest {

    @Test
    public void shouldCalcMonth() {
        HolidayService service = new HolidayService();

        int calc = service.calculate(10_000, 3_000, 20_000);
        System.out.println(calc);
    }
}
