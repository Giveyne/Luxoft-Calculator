package ru.luxoft.courses.lab8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExecMyHashMap {
    public static void main(String[] args) {
        // Переделал на Generic HashMap
        // была ошибка в цикле for метода remove
        // добавил resize при увеличении больше capacity*loadFactor
        // заменил все == на equals
        // реализовал замену существующего ключа новой парой ключ значение
        // убрал перезапись массива со сдвигом поставив простое обнуление
        // Создал next(ссылка) в EntryMyMap для одинаковых хешей
        MyHashMap <String, Integer> map = new MyHashMap<>();

      /*  for (int i = 0; i < 20; i++)
            map.put("Ivan", 1);
*/
        map.put("Igor", 2);
        map.put("Ira", 3);
        map.put("Ivan", 4);
        map.put("Igor", 3);
        System.out.println("Ivan: " + map.get("Ivan"));
        System.out.println("Igor: " + map.get("Igor"));
        System.out.println("size: " + map.size());
        System.out.println("contains Ira: " + map.containsKey("Ira"));
        System.out.println("size: " + map.size());
        System.out.println("isEmpty: " + map.isEmpty());
        System.out.println("contains 1: " + map.containsValue(1));

        System.out.println("Удалить Иру: " + map.remove("Ira"));
        System.out.println("contains Ira: " + map.containsKey("Ira"));
        System.out.println("Ivan: " + map.get("Ivan"));
        System.out.println("Ivan == Ivan: " + map.get("Ivan").equals(map.get("Ivan")));

        System.out.println("0:1:200");
        MyHashMap <Integer, Integer> mapInt = new MyHashMap<>();
        for (int j = 0; j <202; j++){
            mapInt.put(j, j);
        }
        System.out.println("size: " + mapInt.size());
        for (int a = 0; a < 202; a++){
            System.out.println("value for key " + a + ": " + mapInt.get(a));
        }
        System.out.println("size: " + mapInt.size());

        System.out.println("0:16:200");
        mapInt = new MyHashMap<>();
        for (int j = 0; j <202; j += 16){
            mapInt.put(j, j);
        }
        System.out.println("size: " + mapInt.size());
        for (int a = 0; a < 202; a += 16){
            System.out.println("value for key " + a + ": " + mapInt.get(a));
        }
        System.out.println("size: " + mapInt.size());
    }
}
