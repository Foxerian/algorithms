package graph.search.driver;

import model.Node;
import graph.search.BreadthFirstSearch;
import graph.search.DepthFirstSearch;

public class GraphSearchDriver {
    BreadthFirstSearch bfs;
    DepthFirstSearch dfs;
    public GraphSearchDriver() {
        bfs = new BreadthFirstSearch();
        dfs = new DepthFirstSearch();
    }

    public void execute() {
        // Create graph
       /*
                        -------A1-------
                       |                |
                  -----B2           ----A2------
                  |                |            |
             -----B3              A3         ---C3
            |                               |
           B4                               C4
           |                                |
           -----------------   -------------
                             |
                            END
     */
        Node n = new Node();
        Node root = n.buildGraph();

        // BFS
        /*
        System.out.println("Performing traversal on graph starting with root: "+root.getValue());
        bfs.traverse(root);
        System.out.println("Performing level order traversal on graph starting with root: "+root.getValue());
        bfs.levelOrderTraversal(root,0);
        */

        // DFS
        System.out.println("Performing recursive dfs traversal on graph starting with root: "+root.getValue());
        dfs.recursiveTraversal(root, 0);
        System.out.println("Performing traversal using stack on graph starting with root: "+root.getValue());
        dfs.reset();
        dfs.stackTraversal(root);
    }
}
