package ru.luxoft.courses.lab7;


public class ExecMyArrayList {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        for(int i = 0; i < 20; i++)
        list.add("first element");
        list.add("second element");
        System.out.println(list.get(1));
        list.remove(0);
        System.out.println(list.get(1));
        System.out.println(list.get(0));
        System.out.println(list.size());

    }
}
