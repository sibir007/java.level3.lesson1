package ru.geekbrains.java.level3.lesson1.task;

import java.util.ArrayList;
import java.util.Arrays;

public class ChangeTwoEl {
    public static <T> boolean changeTwoEl(ArrayList<T> arrayList, int index1, int index2){
        if (arrayList.size() < index1 || arrayList.size() < index2 || index1 < 0 || index2 < 0){
            return false;
        }
        T item1 = (T) arrayList.get(index1);
        T item2 = (T) arrayList.get(index2);
        arrayList.set(index1, item2);
        arrayList.set(index2, item1);
        return true;
    }
    public static void main(String[] args) {
        ArrayList<String> arrStr = new ArrayList<>(Arrays.asList("A","B","C","D"));
        ArrayList<Double> arrDbl = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0));
        System.out.println("До\n" + arrStr + "\n" + arrDbl);
        changeTwoEl(arrStr, 1, 3);
        changeTwoEl(arrDbl, 1, 3);
        System.out.println("После\n" + arrStr + "\n" + arrDbl);
    }
}
