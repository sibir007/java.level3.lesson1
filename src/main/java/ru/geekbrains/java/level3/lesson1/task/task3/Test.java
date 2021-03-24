package ru.geekbrains.java.level3.lesson1.task.task3;

public class Test {
    public static void main(String[] args) {
        Box<Orange> orangeBox1 = new Box<>(
                new Orange(),
                new Orange(),
                new Orange(),
                new Orange(),
                new Orange()
        );
        Box<Orange> orangeBox2 = new Box<>(
                new Orange(),
                new Orange(),
                new Orange()
        );
        Box<Orange> orangeBox3 = new Box<>(
                new Orange(),
                new Orange(),
                new Orange(),
                new Orange(),
                new Orange()
        );
        Box<Orange> emptyOrangeBox = new Box<>();

        Box<Apple> appleBox1 = new Box<>(
                new Apple(),
                new Apple(),
                new Apple(),
                new Apple(),
                new Apple()
        );
        Box<Apple> appleBox2 = new Box<>(
                new Apple(),
                new Apple()
        );

        System.out.println("Вес orangeBox1: " + orangeBox1.getWeight());
        System.out.println("Сравниваем вес orangeBox1 и orangeBox2, веса равны: "
                + orangeBox1.compare(orangeBox2));
        System.out.println("Сравниваем вес orangeBox1 и orangeBox3, веса равны: "
                + orangeBox1.compare(orangeBox3));
        System.out.println("Сравниваем вес orangeBox1 и appleBox1, веса равны: "
                + orangeBox1.compare(appleBox1));
        System.out.println("Вес appleBox1: " + appleBox1.getWeight() +
                ", Вес appleBox2: " + appleBox2.getWeight());
        System.out.println("Перекладываем яблоки из appleBox1 в appleBox2");
        appleBox1.interlard(appleBox2);
        System.out.println("Вес appleBox1: " + appleBox1.getWeight() +
                ", Вес appleBox1: " + appleBox2.getWeight());
        System.out.println("Пробуем переложить яблоки из appleBox2 в emptyOrangeBox");
//        appleBox2.interlard(emptyOrangeBox);
    }
}
