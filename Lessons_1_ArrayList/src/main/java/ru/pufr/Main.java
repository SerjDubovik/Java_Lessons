package ru.pufr;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            list.add(i);
        }

        list.remove(5);

        for(Integer x : list){
            System.out.println(x);
        }

        System.out.println(list);
        System.out.println(list.size());

    }
}