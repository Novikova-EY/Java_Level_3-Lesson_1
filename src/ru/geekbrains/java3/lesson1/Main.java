package ru.geekbrains.java3.lesson1;

import ru.geekbrains.java3.lesson1.task1.Task1;
import ru.geekbrains.java3.lesson1.task2.Task2;
import ru.geekbrains.java3.lesson1.task3.Box;
import ru.geekbrains.java3.lesson1.task3.Apple;
import ru.geekbrains.java3.lesson1.task3.Orange;

public class Main {
    public static void main(String[] args) {

        /* Задание 1 */
        Task1<String> newArray1 = new Task1<>(new String[]{"a", "b", "c", "d"});
        newArray1.change(4, 1);
        System.out.println("Измененный массив" + newArray1);

        /* Задание 2 */
        Task2<Integer> newArray2 = new Task2<>(new Integer[]{1, 2, 3, 4});
        newArray2.toArrayList();
        System.out.println("Массив, преобразованный в " + newArray2);

        /* Задание 3 */
        Box box1 = new Box(new Apple(), 10);
        Box box2 = new Box(new Orange(), 5);
        box1.getWeight();
        box2.getWeight();
        box1.boxAdd(new Orange(), 1);
        box1.boxAdd(new Apple(), 3);
        box2.boxAdd(new Orange(), 5);
        box1.getWeight();
        box2.getWeight();
        System.out.println(box1.compare(box2));
        box1.boxAdd(new Apple(), 2);
        box1.getWeight();
        System.out.println(box2.compare(box1));
        box1.boxSprinkle(box2);
        Box box3 = new Box(new Apple(), 4);
        box3.getWeight();
        box1.boxSprinkle(box3);
    }
}


