package ru.gb.hometask.task4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LengthConverterTest {
    private final LengthConverter converter = new LengthConverter();

    @Test
    void testMmToUnits() {
        assertEquals(10.0, converter.mmToCm(100.0));
        assertEquals(1.0, converter.mmToDm(100.0));
        assertEquals(0.1, converter.mmToM(100.0));
        assertEquals(0.0001, converter.mmToKm(100.0));
        assertEquals(0.0, converter.mmToCm(-100.0));
    }

    @Test
    void testUnitsToMm() {
        assertEquals(100.0, converter.cmToMm(10.0));
        assertEquals(100.0, converter.dmToMm(1.0));
        assertEquals(100.0, converter.mToMm(0.1));
        assertEquals(100.0, converter.kmToMm(0.0001));
        assertEquals(0.0, converter.cmToMm(-10.0));
    }
}

