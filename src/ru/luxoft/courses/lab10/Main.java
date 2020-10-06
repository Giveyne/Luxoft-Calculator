package ru.luxoft.courses.lab10;

public class Main {

    public static void main(String[] args) {
        Integer arr [] = new Integer[] {2, 3, 1, 32, 31};

        GenericListAgregator<Integer> listAgregator = new GenericListAgregator<>(arr);
        System.out.println(listAgregator.getAvgValue());
        System.out.println(listAgregator.getMaxValue());
        System.out.println(listAgregator.getMinValue());
    }
}
