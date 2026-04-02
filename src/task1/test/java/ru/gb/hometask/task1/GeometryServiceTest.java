package ru.gb.hometask.task1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GeometryServiceTest {
    private final GeometryService service = new GeometryService();

    @Test
    void testSquareArea() {
        assertEquals(25.0, service.squareArea(5.0));
        assertEquals(0.0, service.squareArea(0.0));
        assertEquals(0.0, service.squareArea(-1.0));
    }

    @Test
    void testRectangleArea() {
        assertEquals(20.0, service.rectangleArea(4.0, 5.0));
        assertEquals(0.0, service.rectangleArea(4.0, 0.0));
        assertEquals(0.0, service.rectangleArea(-1.0, 5.0));
    }

    @Test
    void testRhombusArea() {
        assertEquals(10.0, service.rhombusArea(4.0, 5.0));
        assertEquals(0.0, service.rhombusArea(4.0, 0.0));
        assertEquals(0.0, service.rhombusArea(-1.0, 5.0));
    }

    @Test
    void testTriangleAreaValid() {
        assertEquals(6.0, service.triangleArea(3.0, 4.0, 5.0));
    }

    @Test
    void testTriangleAreaInvalid() {
        assertEquals(0.0, service.triangleArea(1.0, 1.0, 3.0));
        assertEquals(0.0, service.triangleArea(-1.0, 4.0, 5.0));
        assertEquals(0.0, service.triangleArea(0.0, 4.0, 5.0));
    }
}

