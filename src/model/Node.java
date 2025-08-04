package model;

public class Node {
    String value;
    Node left;
    Node right;
    Node parent;
    public Node(String value){
        this.value = value;
    }
    public Node(){
    }




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

    public Node buildGraph() {
        Node root = new Node("A1");
        root.left = new Node("B2");
        root.right = new Node("A2");
        root.left.left = new Node("B3");
        root.left.left.left= new Node("B4");


        root.right.left = new Node("A3");
        root.right.right = new Node("C3");
        root.right.right.left = new Node("C4");

        Node end = new Node("End");

        root.left.left.left.right= end;
        root.right.right.left.left = end;
        return root;
    }

    public String getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public Node getParent() {
        return parent;
    }
}
