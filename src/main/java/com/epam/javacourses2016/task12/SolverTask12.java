package com.epam.javacourses2016.task12;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Задан список целых чисел и число X.
 * Не используя вспомогательных объектов и не изменяя размера списка,
 * переставить элементы списка так, чтобы сначала шли числа, не превосходящие X, а затем числа, большие X.
 */
public class SolverTask12 {

    /**
     * Преобразует целочисленный список таким образом, чтобы сначала шли числа меньшие value, затем большие.
     *
     * @param integers Целочисленный список.
     * @param value    Разделительное значение.
     * @return Преобразованный список.
     */
    List<Integer> transform(List<Integer> integers, int value) {
        for (int i = 0; i < integers.size(); i++) {
            if (integers.indexOf(value) > i) {
                if (integers.get(i) > value) {
                    integers.set(integers.indexOf(value), integers.get(i));
                    integers.set(i, value);
                    i=0;
                }
            }
            if (integers.indexOf(value) < i) {
                if (integers.get(i) < value) {
                    integers.set(integers.indexOf(value), integers.get(i));
                    integers.set(i, value);
                    i=0;
                }
            }
        }
        return integers;
    }
}