package ru.geekbrains.java.level3.lesson1.task.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public Box(T... fruits) {
        this.fruits = new ArrayList<>();
        this.fruits.addAll(Arrays.asList(fruits));
    }

    public void addFruit(T fruit){
        fruits.add(fruit);
    }

    public float getWeight() {
        float weight = 0.0f;
        for (T fruit: fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public <T> boolean compare(Box<?> box){
        return this.getWeight() == box.getWeight();
    }

    public void interlard(Box<T> box) {
        box.fruits.addAll(this.fruits);
        this.fruits.removeAll(this.fruits);
    }
}
