package graph.shortestPath.driver;

import graph.shortestPath.Dijkstra;

import java.util.Arrays;

public class DijkstraDriver {
    Dijkstra d;
    public DijkstraDriver() {
        d = new Dijkstra();
    }

    public void execute() {
            /*
                          -- 4 ---A---- 2 --
                         |                  |
                   -2----B            5-----C-----1
                  |      |            |           |
            --1---G      |            F       1---D
           |             3                    |
           H             |                    E
           |             |                    |
           ------- 9 --- END-------1----------


                 A  B  C  D  E  F  G  H  END
               A 0  4  2
               B                   2      3
               C          1     5
               D             1
               E                          1
               F
               G                      1
               H                          9
             END

     */

        int distance[] = d.getShortestPath();
        System.out.println("Shortest Distance to s to dest is:" + Arrays.toString(distance));

        String dist = d.getShortestPathWithPath();
        System.out.println("Shortest Distance to s to dest with path is:" + dist);
    }
}
