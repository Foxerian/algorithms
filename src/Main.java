import graph.search.driver.GraphSearchDriver;
import graph.shortestPath.driver.DijkstraDriver;
import search.driver.BinarySearchDriver;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        // Binary Search execution
        BinarySearchDriver binarySearchDriver = new BinarySearchDriver();
        binarySearchDriver.execute();


        // BFS & DFS on graph
        GraphSearchDriver gsd = new GraphSearchDriver();
        gsd.execute();

        // dijkstra shortest path from source to destination
        DijkstraDriver dijkstraDriver = new DijkstraDriver();
        dijkstraDriver.execute();
    }
}