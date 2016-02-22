package ru.itis.inform;


public interface DirectedGraph {
    /**
     * Добавление вершины в граф
     */
    void addVertex();



    /**
     * Добавление ребра
     * @param vertexA первая вершина
     * @param vertexB вторая вершина
     * @param weight вес ребра
     */
    void addDirectedEdge(int vertexA, int vertexB, int weight);

    /**
     * Вывод графа на экран
     */
    void showGraph();
    void runFloyd();
}
