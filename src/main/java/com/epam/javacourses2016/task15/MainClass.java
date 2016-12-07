package com.epam.javacourses2016.task15;

import com.epam.javacourses2016.Point2D;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;

/**
 * Created by Vasya on 26.11.2016.
 */
public class MainClass {
    public static void main(String[] args) throws IOException {
        SolverTask15 solver = new SolverTask15();
        File file = new File("C:\\Users\\Vasya\\IdeaProjects\\EpamSchool\\SecondPart\\javacourses2016\\src\\main\\java\\com\\epam\\javacourses2016\\task15\\task15.txt");
        file.createNewFile();
        HashSet<Point2D> points = new HashSet<>();
        points.add(new Point2D(1, 1));
        points.add(new Point2D(1, 2));
        points.add(new Point2D(1, 3));

        points.add(new Point2D(1, 4));
        points.add(new Point2D(1, 5));
        points.add(new Point2D(1, 6));
        points.add(new Point2D(1, 7));
        points.add(new Point2D(1, 8));
        points.add(new Point2D(1, 9));
        points.add(new Point2D(1, 10));
        points.add(new Point2D(1, 11));
        points.add(new Point2D(2, 4));
        points.add(new Point2D(2, 5));
        points.add(new Point2D(3, 4));
        points.add(new Point2D(4, 4));
        points.add(new Point2D(5, 4));
        points.add(new Point2D(3, 6));
        points.add(new Point2D(3, 5));
        points.add(new Point2D(4, 6));
        points.add(new Point2D(7, 5));
        solver.analyze(points, file);
        System.out.println("success");
    }
}
