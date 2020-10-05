package ru.luxoft.courses.hierarchy.valut;

public final class Currency {
    private String name;
    private Number value;

    Currency(String name, Number value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Number getValue() {
        return value;
    }

    public void setValue(Number value) {
        this.value = value;
    }
}
