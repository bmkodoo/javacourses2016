package com.epam.javacourses2016.task16;

import com.epam.javacourses2016.Point2D;

import java.io.File;
import java.util.SortedMap;

/**
 * На клетчатой бумаге нарисован круг.
 * Вывести в файл описания всех клеток, целиком лежащих внутри круга.
 * Выводить в порядке возрастания расстояния от клетки до центра круга.
 * Использовать класс SortedMap.
 */
public class SolverTask16 {
    private static final double CELL_SIZE=0.5;
    /**
     * Осуществляет анализ точек, находя среди них попавших внутрь круга.
     *
     * @param center Точка, в которой расположен центр круга.
     * @param radius Радиус круга.
     * @param output Файл для вывода результатов.
     * @return Файл с результатами анализа.
     */
    IFileWithPoints analyze(Point2D center, int radius, File output) {


        //TODO
        //не забыть составить компаратор по дабл
        return null;
    }
/**
 * Возвращает клетки из пересечения окружности и квадрата
 *
 * @param center    Точка, в которой расположен центр круга.
 * @param radius    Радиус круга.
 * @param side Сторона квадрата.
 * @return Множество пар: точка + расстояние до центра.
 */

SortedMap<Point2D, Double> intersectionWithSquare(Point2D center, int radius, double side){
    //первая клетка - это левый верхний угол - centerX-side/2 centerY+side/2
    //и идем по часовой стрелке, один раз меняя направление
    //не забыть составить компаратор по дабл
    //сразу по два значения проверять сверху и снизу, затем слева и справа
for(double x=)
}

    /**
     * Проверяет, входит ли точка в круг
     *
     * @param center    Точка, в которой расположен центр круга.
     * @param radius    Радиус круга.
     * @param candidate Файл для вывода результатов.
     * @return true, если точка полностью внутри круга, иначе false
     */
    private boolean within(Point2D center, int radius, Point2D candidate) {
        if (length(center, candidate) >= radius) return false;
        Cell cell = new Cell(candidate, CELL_SIZE);
        return length(cell.getLowerLeftCorner(), center) < radius &&
                length(cell.getLowerRightCorner(), center) < radius &&
                length(cell.getUpperLeftCorner(), center) < radius &&
                length(cell.getUpperRightCorner(), center) < radius;
    }

    /**
     * @param first  первая точка отрезка
     * @param second вторая точка отрезка
     * @return возвращает длину отрезка
     */
    private double length(Point2D first, Point2D second) {
        return Math.sqrt(Math.pow(second.getY() - first.getY(), 2) + Math.pow(second.getX() - first.getX(), 2));
    }


    /**
     * Представляет файл, содержащий информацию о найденных точках.
     */
    interface IFileWithPoints {

        /**
         * @return Файл с результатами анализа.
         */
        File getFile();

        /**
         * Извлекает из файла информацию о хранящихся в нем точках.
         *
         * @return Множество пар: точка + расстояние до центра.
         */
        SortedMap<Point2D, Double> getPoints();
    }
}
