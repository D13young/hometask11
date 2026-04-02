package ru.gb.hometask.task2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CurrencyConverterTest {
    private final CurrencyConverter converter = new CurrencyConverter();

    @Test
    void testUsdToEur() {
        assertEquals(92.0, converter.usdToEur(100.0), 0.01);
        assertEquals(0.0, converter.usdToEur(-1.0));
    }

    @Test
    void testUsdToGbp() {
        assertEquals(78.0, converter.usdToGbp(100.0), 0.01);
        assertEquals(0.0, converter.usdToGbp(-1.0));
    }

    @Test
    void testUsdToJpy() {
        assertEquals(15000.0, converter.usdToJpy(100.0), 0.01);
        assertEquals(0.0, converter.usdToJpy(-1.0));
    }

    @Test
    void testEurToUsd() {
        assertEquals(108.7, converter.eurToUsd(100.0), 0.1);
        assertEquals(0.0, converter.eurToUsd(-1.0));
    }

    @Test
    void testGbpToUsd() {
        assertEquals(128.21, converter.gbpToUsd(100.0), 0.01);
        assertEquals(0.0, converter.gbpToUsd(-1.0));
    }

    @Test
    void testJpyToUsd() {
        assertEquals(0.67, converter.jpyToUsd(100.0), 0.01);
        assertEquals(0.0, converter.jpyToUsd(-1.0));
    }
}

