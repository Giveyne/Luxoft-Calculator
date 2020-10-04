package ru.luxoft.courses.lab5;

public class Currancy {
    private String name;
    private float usdCource;

    public Currancy(String name, float usdCource) {
        this.name = name;
        this.usdCource = usdCource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getUsdCource() {
        return usdCource;
    }

    public void setUsdCource(float usdCource) {
        this.usdCource = usdCource;
    }
}
