package ru.geekbrains.java3.lesson1.task1;

import java.util.Arrays;

public class Task1<T> {
    private T[] myArray;

    public Task1(T[] myArray) {
        this.myArray = myArray;
    }

    public void change (int a, int b) {
        if ((a >= 0 && a <= myArray.length) && (b >= 0 && b <= myArray.length)) {
            T temp = myArray[a - 1];
            myArray[a - 1] = myArray[b - 1];
            myArray[b - 1] = temp;
        } else System.out.println("Неверно заданы значения индексов");
    }

    @Override
    public String toString() {
        return Arrays.toString(myArray);
    }
}
