package graph.search;

import model.Node;

import java.util.HashSet;
import java.util.Stack;

public class DepthFirstSearch {
    HashSet<String> hs;

    public DepthFirstSearch() {
        this.hs = new HashSet<>();
    }

    /*
                        -------A1-------
                       |                |
                  -----B2           ----A2------
                  |                |            |
             -----B3              A3         ---C3
            |                               |
           B4 ----------------------------- C4

     */

    public void reset(){
        this.hs = new HashSet<>();
    }

    public void stackTraversal(Node root){
        int level=0;
        Stack<Node> st = new Stack<>();
        st.add(root);
        while(!st.isEmpty()) {
            Node currentNode = st.pop();
            if (hs.contains(currentNode.getValue())) {
                continue;
            }
            hs.add(currentNode.getValue());
            System.out.println("Traverse the node: "+currentNode.getValue()+" level: "+ level++);
            if (currentNode.getLeft()!=null && !hs.contains(currentNode.getLeft().getValue())) {
               st.add(currentNode.getLeft());
            }
            if (currentNode.getRight()!=null && !hs.contains(currentNode.getRight().getValue())) {
                st.add(currentNode.getRight());
            }
        }
    }

    public int recursiveTraversal(Node root,int level){
        if (hs.contains(root.getValue())) {
            return level;
        }
        hs.add(root.getValue());
        System.out.println("Traverse the node: "+root.getValue()+ " level: "+ level++);
        if (root.getLeft()!=null && !hs.contains(root.getLeft().getValue())) {
            level = recursiveTraversal(root.getLeft(), level);
        }
        if (root.getRight()!=null && !hs.contains(root.getRight().getValue())) {
            level = recursiveTraversal(root.getRight(),level);
        }
        return level;
    }

}
