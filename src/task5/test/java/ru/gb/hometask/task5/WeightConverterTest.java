package ru.gb.hometask.task5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WeightConverterTest {
    private final WeightConverter converter = new WeightConverter();

    @Test
    void testMgToUnits() {
        assertEquals(1.0, converter.mgToG(1000.0));
        assertEquals(0.001, converter.mgToKg(1000.0));
        assertEquals(0.00001, converter.mgToCentner(1000.0));
        assertEquals(0.000001, converter.mgToTon(1000.0));
        assertEquals(0.0, converter.mgToG(-1000.0));
    }

    @Test
    void testUnitsToMg() {
        assertEquals(1000.0, converter.gToMg(1.0), 1e-9);
        assertEquals(1000.0, converter.kgToMg(0.001), 1e-9);
        assertEquals(1000.0, converter.centnerToMg(0.00001), 1e-9);
        assertEquals(1000.0, converter.tonToMg(0.000001), 1e-9);
        assertEquals(0.0, converter.gToMg(-1.0));
    }
}

