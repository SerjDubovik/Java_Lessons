package ru.pufr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> animals = new ArrayList<>();

        animals.add("dog");
        animals.add("cat");
        animals.add("frog");
        animals.add("bird");

        //Collections.sort(animals);
        Collections.sort(animals, new  StringLengthComparator());

        System.out.println(animals);

        List<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(0);
        numbers.add(500);
        numbers.add(100);

        //Collections.sort(numbers);
        Collections.sort(numbers, new Comparator<Integer>() { // сортируем от большого к меньшему, через анонимный класс
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 > o2) {
                    return -1;
                } else if(o1 < o2){
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        System.out.println(numbers);

        List<Person> people = new ArrayList<>();

        people.add(new Person(1, "Bob"));
        people.add(new Person(2,"Katy"));
        people.add(new Person(3,"Mike"));

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.getId() > o2.getId()){
                    return 1;
                } else if (o1.getId() < o2.getId()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        System.out.println(people);

    }
}

class StringLengthComparator implements Comparator<String> { // переопределяем для организации своей логики сортировки

    @Override
    public int compare(String o1, String o2) {

        if(o1.length() > o2.length()){
            return 1;
        } else if(o1.length() < o2.length()){
            return -1;
        } else {
            return  0;
        }

    }
}


class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}