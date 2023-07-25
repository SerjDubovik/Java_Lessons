package ru.pufr;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String a = "Go12452356too576578678Hell";
        String[] words = a.split("\\d+");

        System.out.println(Arrays.toString(words));

        String b = "Go too Hell";
        String b1 = b.replaceAll(" ", ".");
        System.out.println(b1);

    }
}