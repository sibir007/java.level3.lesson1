package ru.geekbrains.java.level3.lesson1.task;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertingArrToArrayList {
    public static <T> ArrayList<T> convertingArrToArrayList(T[] arr) {
        ArrayList<T> arrayList = new ArrayList<>(Arrays.asList(arr));
        return arrayList;
    }

    public static void main(String[] args) {
        Character[] chars = {'A', 'B', 'C', 'D'};
        Integer[] ints = {1, 2, 3, 4};

        ArrayList arrayListChar = convertingArrToArrayList(chars);
        System.out.println(arrayListChar.getClass() + " " + arrayListChar);

        ArrayList arrayListInts = convertingArrToArrayList(ints);
        System.out.println(arrayListInts.getClass() + " " + arrayListInts);
    }
}
