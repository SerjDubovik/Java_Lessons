package ru.pufr;

public class Main {
    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);

        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get(1));

        myLinkedList.remove(2);
        System.out.println(myLinkedList);

    }
}