package ru.itis.inform;

 interface Graph {

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
    void addEdge(int vertexA, int vertexB, int weight);

    /**
     * Вывод графа на экран
     */
    void showGraph();
}
