package ru.geekbrains.java3.lesson1.task2;

import java.util.ArrayList;
import java.util.Collections;

public class Task2<T> {
    private T[] myArray;
    private ArrayList<T> arrayList = new ArrayList<>();

    public Task2(T[] myArray) {
        this.myArray = myArray;
    }

    public void toArrayList() {
        Collections.addAll(arrayList, myArray);
    }

    @Override
    public String toString() {
        return "ArrayList = " + arrayList;
    }
}
