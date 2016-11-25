package com.epam.javacourses2016.task13;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vasya on 25.11.2016.
 */
public class Graph extends AbstractGraphCreator.AbstractGraph {
    private List<Edge> edges = new ArrayList<>();

    public Graph(int numberNodes) {
        super(numberNodes);
    }

    /**
     * Добавление ребра в граф.
     *
     * @param first  Первая связываемая вершина.
     * @param second Вторая связываемая вершина.
     */
    @Override
    public void addEdge(int first, int second) {
        edges.add(new Edge(first, second));
    }

    /**
     * Удаление ребра из графа.
     *
     * @param first  Первая освобождаемая от связи вершина.
     * @param second Вторая освобождаемая от связи вершина.
     */
    @Override
    public void removeEdge(int first, int second) {
        for (Edge edge : edges) {
            if (edge.is(first, second)) {
                edges.remove(edge);
                return;
            }
        }
    }

    /**
     * Проверка наличия ребра.
     *
     * @param first  Первая вершина.
     * @param second Вторая вершина.
     */
    @Override
    public boolean isExistEdge(int first, int second) {
        for (Edge edge : edges) {
            if (edge.is(first, second)) return true;
        }
        return false;
    }
}
