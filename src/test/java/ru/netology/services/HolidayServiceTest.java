package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class HolidayServiceTest {

    @ParameterizedTest
    @CsvFileSource (files = "src/test/resources/conditions.csv")

    public void shouldCalcMonth(int income, int expenses, int threshold) {
        HolidayService service = new HolidayService();

        int calc = service.calculate(income, expenses, threshold);
        System.out.println(calc);
    }
}
