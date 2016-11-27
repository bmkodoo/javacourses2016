package com.epam.javacourses2016.task16;

import com.epam.javacourses2016.Point2D;

/**
 * Created by Vasya on 27.11.2016.
 */
public class Cell {
    private static final double SIZE = 0.5;
    private final Point2D center;

    public Cell(Point2D center) {
        this.center = center;
    }

    public Point2D getCenter() {
        return center;
    }

    public Point2D getLowerLeftCorner() {
        return new Point2D(this.center.getX() - SIZE / 2, this.center.getY() - SIZE / 2);
    }

    public Point2D getLowerRightCorner() {
        return new Point2D(this.center.getX() + SIZE / 2, this.center.getY() - SIZE / 2);
    }

    public Point2D getUpperLeftCorner() {
        return new Point2D(this.center.getX() + SIZE / 2, this.center.getY() + SIZE / 2);
    }

    public Point2D getUpperRightCorner() {
        return new Point2D(this.center.getX() + SIZE / 2, this.center.getY() + SIZE / 2);
    }
}
