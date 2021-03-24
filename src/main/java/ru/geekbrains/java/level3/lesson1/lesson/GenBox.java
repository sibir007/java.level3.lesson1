package ru.geekbrains.java.level3.lesson1.lesson;

public class GenBox<T> {
    private T obj;

    public GenBox(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
