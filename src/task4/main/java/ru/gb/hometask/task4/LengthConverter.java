package ru.gb.hometask.task4;

public class LengthConverter {
    public double mmToCm(double mm) {
        if (mm < 0) return 0.0;
        return mm / 10.0;
    }

    public double mmToDm(double mm) {
        if (mm < 0) return 0.0;
        return mm / 100.0;
    }

    public double mmToM(double mm) {
        if (mm < 0) return 0.0;
        return mm / 1000.0;
    }

    public double mmToKm(double mm) {
        if (mm < 0) return 0.0;
        return mm / 1000000.0;
    }

    public double cmToMm(double cm) {
        if (cm < 0) return 0.0;
        return cm * 10.0;
    }

    public double dmToMm(double dm) {
        if (dm < 0) return 0.0;
        return dm * 100.0;
    }

    public double mToMm(double m) {
        if (m < 0) return 0.0;
        return m * 1000.0;
    }

    public double kmToMm(double km) {
        if (km < 0) return 0.0;
        return km * 1000000.0;
    }
}

