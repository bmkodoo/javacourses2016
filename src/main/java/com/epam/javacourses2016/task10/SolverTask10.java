package com.epam.javacourses2016.task10;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Задан файл, содержащий английские слова (без знаков препинания).
 * Требуется выделить все различные слова и посчитать частоту их встречаемости.
 * Слова, отличающиеся регистром букв, считать различными.
 * Использовать класс HashMap.
 */
public class SolverTask10 {

    /**
     * Подсчитывает количество вхождений каждого слова в файле.
     * @param input Файл с исходными данными.
     * @return Множество пар <слово, количество вхождений в файле>.
     */
    public HashMap<String, Integer> countNumberWords(File input) throws IOException {

        HashMap<String,Integer> strings = new HashMap<>();
        Scanner sc = new Scanner(input);
        while(sc.hasNext()){
            String line = sc.nextLine();
            String[] words = line.split(" ");
            for(String s : words) {
                if(!strings.containsKey(s)) {
                    strings.put(s,1);
                } else {
                    strings.put(s,strings.get(s) + 1);
                }
            }
        }
        return strings;
    }
}
