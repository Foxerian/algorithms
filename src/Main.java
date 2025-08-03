import graph.search.driver.GraphSearchDriver;
import search.driver.BinarySearchDriver;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        // Binary Search execution
        BinarySearchDriver binarySearchDriver = new BinarySearchDriver();
        binarySearchDriver.execute();


        // BFS on graph
        GraphSearchDriver gsd = new GraphSearchDriver();
        gsd.execute();
    }
}