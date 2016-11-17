package com.epam.javacourses2016.task2;

import java.io.File;
import java.util.Set;
import java.util.TreeSet;

/**
 * Сформировать множество элементов, входящих в каталог и его подкаталоги.
 */
public class SolverTask2 {

    /**
     * Формирует множество всех элементов, входящих в текущий каталог и во все вложенные.
     *
     * @param directory Корневой каталог.
     * @return Множество элементов корневого каталога и подкаталогов.
     */
    public Set<File> getFiles(File directory) {
        Set<File> fileset = new TreeSet();
        File[] folderfiles = directory.listFiles();
        for (File file : folderfiles) {
            if (file.isDirectory()) {
                fileset.addAll(getFiles(file));
                continue;
            }
            fileset.add(file);
        }
        return fileset;
    }
}
