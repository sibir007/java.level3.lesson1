package ru.geekbrains.java.level3.lesson1.lesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoxWithNum<N extends Number> {
    private List<N> numbers;

    public BoxWithNum(N... numbers){
        this.numbers = new ArrayList<>(Arrays.asList(numbers));
    }

    public double sum() {
        double res = 0.0;
        for (int i = 0; i < numbers.size(); i++) {
            res += numbers.get(i).doubleValue();
        }
        return res;
    }
    //сравнивать через "==" нельзя, ошибка округления
    public boolean compareBySum1(BoxWithNum<?> another){
        return this.sum() == another.sum();
    }

    public boolean compareBySum(BoxWithNum<?> another){
        return Math.abs(this.sum() - another.sum()) < 0.0001;
    }

}
