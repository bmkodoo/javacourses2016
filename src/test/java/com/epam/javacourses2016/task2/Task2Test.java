package com.epam.javacourses2016.task2;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import org.testng.annotations.DataProvider;

import java.util.HashSet;
import java.util.Set;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Task2Test {
    @Test(enabled = true, dataProvider = "directory")
    public void testTask2(String directory) {
        SolverTask2 solver = new SolverTask2();
        File file = new File(directory);

        Set<File> solverSet = solver.getFiles(file);
        Set<File> testSet = getFiles(file);

        Assert.assertEquals(solverSet, testSet);
    }

    @DataProvider(name = "directory")
    public Object[][] directory() {
        return new Object[][]{
                {"src/main/java/com/epam/javacourses2016/task1"},
                {"src/main/java/com/epam/javacourses2016"},
        };
    }

    private Set<File> getFiles(File directory) {
        Set<File> files = new HashSet<>();

        for (File file : directory.listFiles()) {
            files.add(file);
            if (file.isDirectory()) {
                files.addAll(getFiles(file));
            }
        }

<<<<<<< HEAD
        return files;
=======
    private File fileCreate(String path) {
        String fileSeparator = System.getProperty("file.separator");

        File file = new File(path);
        try {

            if (!file.exists()) {
                file.createNewFile();
                System.out.println(path + " was create");

            } else {
                System.out.println(path + " already exist");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    public static void recursiveDelete(File file) {
        if (!file.exists())
            return;
        if (file.isDirectory()) {
            for (File f : file.listFiles()) {
                recursiveDelete(f);
            }
        }
        file.delete();
    }

    @Test
    public void testTask2() {
        String fileSeparator = System.getProperty("file.separator");
        String tmpDir = System.getProperty("java.io.tmpdir");
        new File(tmpDir + "tmp java Task2 Test" + fileSeparator + "highlvl" + fileSeparator + "midlvl" + fileSeparator + "lowlvl").mkdirs();
        StringBuilder path = new StringBuilder(tmpDir + "tmp java Task2 Test" + fileSeparator + "highlvl" + fileSeparator);
        Set<File> filehashset = new HashSet<>();
        File rootfile = new File(tmpDir + "tmp java Task2 Test");
        filehashset.add(fileCreate(path + "tmpfile1.tmp"));
        filehashset.add(fileCreate(path + "tmpfile2.tmp"));
        filehashset.add(fileCreate(path + "tmpfile3.tmp"));
        path.append("midlvl" + fileSeparator);
        filehashset.add(fileCreate(path + "tmpfile4.tmp"));
        filehashset.add(fileCreate(path + "tmpfile5.tmp"));
        path.append("lowlvl" + fileSeparator);
        filehashset.add(fileCreate(path + "tmpfile6.tmp"));

        SolverTask2 solver = new SolverTask2();
        Assert.assertTrue(filehashset.containsAll(solver.getFiles(rootfile)));

        recursiveDelete(rootfile);
>>>>>>> Task_2
    }
}