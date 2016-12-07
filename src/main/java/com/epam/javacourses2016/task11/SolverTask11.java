package com.epam.javacourses2016.task11;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * В кругу стоят N человек.
 * На каждой итерации цикла выбывает человек (через одного, начиная с первого), пока не останется единственный.
 * Разработать два решения, моделирующие процесс.
 * Первое должно использовать класс ArrayList, а второе – LinkedList.
 */
public class SolverTask11 {

    /**
     * Выполняет эмуляцию поставленной задачи.
     *
     * @param peoples Список с именами участников.
     * @return Имя последнего оставшегося.
     */
    public String emulate(ArrayList<String> peoples) {
        int index = 0;
        int sizeInStart = 0;
        while (peoples.size() != 1) {
            if (index >= peoples.size()) {
                if (sizeInStart % 2 == 0) {
                    index = 0;
                } else {
                    index = 1;
                }
            }
            peoples.remove(index);
            index++;
        }
        return peoples.get(0);
    }

    /**
     * Выполняет эмуляцию поставленной задачи.
     *
     * @param peoples Список с именами участников.
     * @return Имя последнего оставшегося.
     */
    public String emulate(LinkedList<String> peoples) {
        int index = 0;
        int sizeInStart = peoples.size();
        while (peoples.size() > 1) {
            peoples.remove(index);
            index++;
            if (index >= peoples.size()) {
                if (sizeInStart % 2 == 0) {
                    index = 0;
                } else {
                    index = 1;
                }
            }
        }
        return peoples.getFirst();
    }

}
