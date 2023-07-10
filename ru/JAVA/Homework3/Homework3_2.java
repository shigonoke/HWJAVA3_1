package ru.JAVA.Homework3;

// 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное
// и среднее арифметическое из этого списка.

import java.util.ArrayList;
import java.util.Collections;

public class Homework3_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(3);
        list.add(18);
        list.add(7);
        list.add(12);
        list.add(8);

        System.out.println("Список: " + list);

        int min = Collections.min(list);
        int max = Collections.max(list);
        double average = list.stream().mapToInt(Integer::intValue).average().orElse(0);

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее арифметическое значение: " + average);
    }
}

