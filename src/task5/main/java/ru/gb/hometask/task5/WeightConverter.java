package ru.gb.hometask.task5;

public class WeightConverter {
    public double mgToG(double mg) {
        if (mg < 0) return 0.0;
        return mg / 1000.0;
    }

    public double mgToKg(double mg) {
        if (mg < 0) return 0.0;
        return mg / 1000000.0;
    }

    public double mgToCentner(double mg) {
        if (mg < 0) return 0.0;
        return mg / 100000000.0;
    }

    public double mgToTon(double mg) {
        if (mg < 0) return 0.0;
        return mg / 1000000000.0;
    }

    public double gToMg(double g) {
        if (g < 0) return 0.0;
        return g * 1000.0;
    }

    public double kgToMg(double kg) {
        if (kg < 0) return 0.0;
        return kg * 1000000.0;
    }

    public double centnerToMg(double centner) {
        if (centner < 0) return 0.0;
        return centner * 100000000.0;
    }

    public double tonToMg(double ton) {
        if (ton < 0) return 0.0;
        return ton * 1000000000.0;
    }
}

