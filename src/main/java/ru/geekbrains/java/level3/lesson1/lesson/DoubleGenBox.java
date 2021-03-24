package ru.geekbrains.java.level3.lesson1.lesson;

public class DoubleGenBox<T, K> {
    private T obj1;
    private T obj2;
    private K obj3;

    public DoubleGenBox(T obj1, T obj2, K obj3) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    public T getObj() {
        return obj1;
    }

    public void setObj(T obj) {
        this.obj1 = obj;
    }

    public T getObj2() {
        return obj2;
    }

    public void setObj2(T obj2) {
        this.obj2 = obj2;
    }

    public K getObj3() {
        return obj3;
    }

    public void setObj3(K obj3) {
        this.obj3 = obj3;
    }
}
