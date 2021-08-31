package ru.geekbrains.java3.lesson1.task3;

import java.util.ArrayList;

public class Box <T extends Fruit> {
    private int quantity;
    private T fruit;
    private ArrayList<T> box = new ArrayList<>();

    public Box(T fruit, int quantity) {
        this.fruit = fruit;
        this.quantity = quantity;
        for (int i = 0; i < quantity; i++) {
            box.add(fruit);
        }
    }

    /* метод добавления идентичных фруктов в существующую коробку */
    public void boxAdd(T fruit, int quantity) {
        if ((box.get(0).getClass().getName()).equals(fruit.getClass().getName())) {
            for (int i = 0; i < quantity; i++) {
                box.add(fruit);
            }
        } else System.out.println("Коробка " + this.box.get(0).getClass().getName() + " не пополнена, ее вес остался тем же.");
    }

    /* метод вычисления веса коробки */
    public float getWeightBox() {
        float weightBox = 0.0f;
        for (int i = 0; i < box.toArray().length; i++) {
            weightBox += fruit.getWeightFruit();
        }
        return weightBox;
    }

    /* метод вывода в консоль веса коробки */
    public void getWeight() {
        System.out.println("Вес коробки " + this.box.get(0).getClass().getName() + " = " + this.getWeightBox());
    }

    /* метод сравнения веса двух коробок */
    public boolean compare(Box another) {
        return (Math.abs(this.getWeightBox() - another.getWeightBox()) < 0.001);
    }

    /* метод полного пересыпания идентичных фруктов в другую коробку */
    public void boxSprinkle(Box another) {
        if (this.box.get(0).getClass().getName().equals(another.box.get(0).getClass().getName())) {
            this.box.addAll(another.box);
            another.box.clear();
            getWeight();
        } else System.out.println("Коробки имеют разное содержимое.");
    }
}


