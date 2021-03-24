package ru.geekbrains.java.level3.lesson1.lesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        //GenBox
        GenBox<Integer> genBox1 = new GenBox<>(100);
        GenBox<Integer> genBox2 = new GenBox<>(200);
        genBox1.setObj(500);
        int res = genBox1.getObj() + genBox2.getObj();
        System.out.println(res);

        //BoxWithNum
        BoxWithNum<Float> box1 = new BoxWithNum<>(1.0f, 2.0f, 3.0f);
        System.out.println(box1.sum());

        BoxWithNum<Integer> box2 = new BoxWithNum<>(1, 2, 3);
        BoxWithNum<Integer> box3 = new BoxWithNum<>(3, 2, 1);
        System.out.println(box2.compareBySum(box3));
        System.out.println(box1.compareBySum(box2));

        //Почему нельзя сравнивать "=="
        float a = 0.7f;
        float b = 0.0f;
        for (int i = 0; i < 70; i++) { //b=0.69999963
            b += 0.01f;
        }
        System.out.println(b == a); //false
        System.out.println(Math.abs(a-b) < 0.001);//true
        System.out.println(a);
        System.out.println(b);

        List<Float> list = new ArrayList<>(Arrays.asList(1f,2f,3f));
        getFirstElement(list);
    }
    public static <T extends Number> T getFirstElement(List<T> list) {
        return list.get(0);
    }

    public static double avg(List<? extends Number> list) {
        double res = 0.0;
        for (int i = 0; i < list.size(); i++) {
            res += list.get(i).doubleValue();
        }
        return res / list.size();
    }
}
