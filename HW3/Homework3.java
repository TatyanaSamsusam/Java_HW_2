package HW3;

/*

9.* Напишите программу для копирования одного списка массивов в другой.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class Homework3 {
    public static void main(String[] args) {

        // Создайте новый список массивов, добавить несколько цветов (строку) и вывести коллекцию на экран.
        ArrayList<String>rainbow = new ArrayList<>();
        rainbow.add("red");
        rainbow.add("orange");
        rainbow.add("yellow");
        rainbow.add("green");
        rainbow.add("blue");
        rainbow.add("purple");

        System.out.print("Создала список rainbow: \n");
        for (int i = 0; i < rainbow.size(); i++) {
            System.out.println(rainbow.get(i));
        }
        // Проитерируйте все элементы списка цветов и добавьте к каждому символ '!'.
        ListIterator <String> liter = rainbow.listIterator();
        while (liter.hasNext()) {
            String i = liter.next();
            liter.set(i + "!");
        }
        System.out.print("Измененный rainbow с воскл. знаками: \n");
        for (int i = 0; i < rainbow.size(); i++) {
            System.out.println(rainbow.get(i));
        }
        // Напишите программу для вставки элемента в список массивов в первой позиции.
        rainbow.add(1, "black");

        // Извлеките элемент (по указанному индексу) из заданного списка.
        System.out.println("добавила новый цвет под индексом 1: " + rainbow.get(1));
        for (int i = 0; i < rainbow.size(); i++) {
            System.out.println(rainbow.get(i));
        }
        
        // Обновите элемент массива по заданному индексу.
        System.out.println("обновила элемент с индексом 0: ");
        rainbow.set(0, "mint");
        for (int i = 0; i < rainbow.size(); i++) {
            System.out.println(rainbow.get(i));
        }
        // Напишите программу для удаления третьего элемента из списка массивов
        rainbow.remove(2);
        System.out.println("удалила третий элемент: ");
        for (int i = 0; i < rainbow.size(); i++) {
            System.out.println(rainbow.get(i));
        }
        // Напишите программу для поиска элемента в списке массивов
        System.out.println("распечатала все элементы, содержащие 'bl': ");
        for (String color : rainbow) {
            if(color.contains("bl")){
                System.out.println(color);
            }
        }
        // Напишите программу для сортировки заданного списка массивов.
        Collections.sort(rainbow);
        System.out.println("вот отсортированный по алфавиту список: ");
        for (int i = 0; i < rainbow.size(); i++) {
            System.out.println(rainbow.get(i));
        }
        // Напишите программу для копирования одного списка массивов в другой

        ArrayList<String>newRainbow = new ArrayList<>();
        System.out.println("в новый список newRainbow скопировала данные из rainbow: ");
        newRainbow.addAll(rainbow);
        for (int i = 0; i < newRainbow.size(); i++) {
            System.out.println(newRainbow.get(i));
        }
    }
}
