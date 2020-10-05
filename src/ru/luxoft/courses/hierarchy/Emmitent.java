package ru.luxoft.courses.hierarchy;

import java.util.ArrayList;
import java.util.List;

public class Emmitent {
    private String name;
    private Stock stock;
    private List<Market> marketList = new ArrayList<>();

    public Emmitent(String name, Stock stock, List<Market> marketList) {
        this.name = name;
        this.stock = stock;
        this.marketList = marketList;
    }

    public void addMarket(Market market) {
        this.marketList.add(market);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Market> getMarketList() {
        return marketList;
    }

    public void setMarketList(List<Market> marketList) {
        this.marketList = marketList;
    }
}
