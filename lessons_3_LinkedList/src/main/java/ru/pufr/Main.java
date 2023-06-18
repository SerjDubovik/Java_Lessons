package ru.pufr;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        // добавляем в конец списка
        measureTime1(linkedList);             // 240 мс
        measureTime1(arrayList);              // 204 мс

        // читаем get
        //measureTime2(linkedList);               // 6259 мс
        //measureTime2(arrayList);                // 7 мс

        // добавляем в начало списка
        //measureTime3(linkedList);           // 16 мс
        //measureTime3(arrayList);            // 1523 мс
    }

    private static void measureTime1(List<Integer> list){
        long start = System.currentTimeMillis();

            for(int i = 0; i < 1000000; i++){
                list.add(i);
            }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }



    private static void measureTime2(List<Integer> list){

        for(int i = 0; i < 100000; i++){
            list.add(i);
        }

        long start = System.currentTimeMillis();

        for(int i = 0; i < 100000; i++){
            list.get(i);
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }




    private static void measureTime3(List<Integer> list){
        long start = System.currentTimeMillis();

        for(int i = 0; i < 100000; i++){
            list.add(0, i);
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);

    }
}





/*
arrayList быстрее добавляет чем linkedList
arrayList значительно быстрее считывает чем linkedList
 */