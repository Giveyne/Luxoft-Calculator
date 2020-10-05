package ru.luxoft.courses.lab7;

public class MyArrayList <T> {
    private final int INIT_SIZE = 16;
    private final int CUT_RATE = 4;
    private Object[] array = new Object[INIT_SIZE];
    private int pointer = 0;

    public void add(T item){
        array[pointer++] = item;
    }

    private void resize (int newLength){
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }

    public void get (T item){
        if(pointer == array.length-1) {
            resize(array.length * 2);
        }
        array[pointer++] = item;
    }

}
