package ru.gb.hometask.task2;

public class CurrencyConverter {
    public static final double USD_TO_EUR = 0.92;
    public static final double USD_TO_GBP = 0.78;
    public static final double USD_TO_JPY = 150.0;
    public static final double EUR_TO_USD = 1.0 / USD_TO_EUR;
    public static final double GBP_TO_USD = 1.0 / USD_TO_GBP;
    public static final double JPY_TO_USD = 1.0 / USD_TO_JPY;

    public double usdToEur(double usd) {
        if (usd < 0) return 0.0;
        return usd * USD_TO_EUR;
    }

    public double usdToGbp(double usd) {
        if (usd < 0) return 0.0;
        return usd * USD_TO_GBP;
    }

    public double usdToJpy(double usd) {
        if (usd < 0) return 0.0;
        return usd * USD_TO_JPY;
    }

    public double eurToUsd(double eur) {
        if (eur < 0) return 0.0;
        return eur * EUR_TO_USD;
    }

    public double gbpToUsd(double gbp) {
        if (gbp < 0) return 0.0;
        return gbp * GBP_TO_USD;
    }

    public double jpyToUsd(double jpy) {
        if (jpy < 0) return 0.0;
        return jpy * JPY_TO_USD;
    }
}

