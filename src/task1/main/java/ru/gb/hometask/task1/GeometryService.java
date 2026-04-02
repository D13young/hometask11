package ru.gb.hometask.task1;

public class GeometryService {
    public double squareArea(double side) {
        if (side <= 0) return 0.0;
        return side * side;
    }

    public double rectangleArea(double width, double height) {
        if (width <= 0 || height <= 0) return 0.0;
        return width * height;
    }

    public double rhombusArea(double d1, double d2) {
        if (d1 <= 0 || d2 <= 0) return 0.0;
        return (d1 * d2) / 2.0;
    }

    public double triangleArea(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) return 0.0;
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

