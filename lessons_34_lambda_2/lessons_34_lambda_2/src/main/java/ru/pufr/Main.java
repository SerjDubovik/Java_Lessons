package ru.pufr;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[10];
        List<Integer> list = new ArrayList<>();

        fillArr(arr);
        fillList(list);

        System.out.println(list);
        System.out.println(Arrays.toString(arr));

//        for(int i = 0; i < 10; i++){
//            arr[i] = arr[i] * 2;
//            list.set(i, list.get(i) * 2);
//        }

        // map method
        arr = Arrays.stream(arr).map(a -> a * 2).toArray();
        list = list.stream().map(a -> a * 2).collect(Collectors.toList());

        System.out.println(list);
        System.out.println(Arrays.toString(arr));

        // filter method

        list.clear();

        fillArr(arr);
        fillList(list);

        int[] arr1 = Arrays.stream(arr).filter(a -> a % 2 == 0).toArray();
        list = list.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());

        System.out.println(list);
        System.out.println(Arrays.toString(arr1));

        // forEach
        list.clear();

        fillArr(arr);
        fillList(list);

        Arrays.stream(arr).forEach(System.out::print);
        list.stream().forEach(System.out::println);

        // reduce
        list.clear();

        fillArr(arr);
        fillList(list);

        int sum1 = Arrays.stream(arr).reduce((acc, b) -> acc + b).getAsInt();
        int sum2 = list.stream().reduce((acc, b) -> acc * b).get();

        System.out.println(sum1);
        System.out.println(sum2);

        //
        fillArr(arr);
        int[] newArr = Arrays.stream(arr).filter(a -> a % 2 != 0).map(a -> a * 2).toArray();
        System.out.println(Arrays.toString(newArr));

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(5);
        System.out.println(set);

        set = set.stream().map(a -> a * 3).collect(Collectors.toSet());

        System.out.println(set);

    }


    private  static  void fillList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
    }

    private  static void fillArr(int[] arr) {
        for (int i = 0; i < 10; i++) {
            arr[i] = i + 1;
        }
    }

}