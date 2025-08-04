package graph.search;

import model.Node;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
    HashSet<String> visited;
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

    public BreadthFirstSearch(){
        visited = new HashSet<>();
    }

    public void traverse(Node root){
     HashSet<String> visited = new HashSet<>();
     Queue<Node> q = new LinkedList<>();
     q.add(root);
     while(!q.isEmpty()){
         Node currentNode = q.poll();
         if(visited.contains(currentNode.getValue())){
             // This can happen as we are processing setting visited at much later stage.
             // If at some level right and left point to same node then this can happen. Note when it's on same level.
             continue;
         }
         visited.add(currentNode.getValue());
         System.out.println("CurrentNode: "+ currentNode.getValue());
         if(currentNode.getLeft()!=null && !visited.contains(currentNode.getLeft().getValue())){
             // System.out.println("left: "+ currentNode.getLeft().getValue());
             q.add(currentNode.getLeft());
         }
         if(currentNode.getRight()!=null && !visited.contains(currentNode.getRight().getValue())){
             // System.out.println("right: "+ currentNode.getRight().getValue());
             q.add(currentNode.getRight());
         }
     }
     System.out.println("Completed traversal for the Graph");
    }

    public void levelOrderTraversal(Node node, int level) {
        if (!visited.contains(node.getValue())) {
            visited.add(node.getValue());
            System.out.println("Visited node: "+node.getValue()+" at level: "+level);
            if(node.getLeft()!=null && !visited.contains(node.getLeft().getValue())){
                levelOrderTraversal(node.getLeft(), level+1);
            }
            if(node.getRight()!=null && !visited.contains(node.getRight().getValue())){
                levelOrderTraversal(node.getRight(), level+1);
            }
        }
        return;
    }
}
