package graph.search.driver;

import graph.Node;
import graph.search.BreadthFirstSearch;

public class GraphSearchDriver {
    BreadthFirstSearch bfs;
    public GraphSearchDriver() {
        bfs = new BreadthFirstSearch();
    }

    public void execute() {
        Node n = new Node();
        Node root = n.buildGraph();

        System.out.println("Performing traversal on graph starting with root: "+root.getValue());
        bfs.traverse(root);
        System.out.println("Performing level order traversal on graph starting with root: "+root.getValue());
        bfs.levelOrderTraversal(root,0);
    }
}
