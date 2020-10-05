package ru.luxoft.courses.hierarchy.valut;

public class CurrencyFabric {
    private CurrencyFabric() {
    }

    public static Currency getDollar(Number value) {
        return new Currency("dollar", value);
    }

    public static Currency getEuro(Number value) {
        return new Currency("euro", value);
    }

    public static Currency getRub(Number value) {
        return new Currency("Rub", value);
    }
}
