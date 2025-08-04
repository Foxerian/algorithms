package graph.shortestPath;

import model.Pair;

import java.security.KeyPair;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkstra {

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
    int weightedGraph[][] = {
                                {0,4,2,0,0,0,0,0,0},
                                {0,0,0,0,0,0,2,0,3},
                                {0,0,0,1,0,5,0,0,0},
                                {0,0,0,0,1,0,0,0,0},
                                {0,0,0,0,0,0,0,0,1},
                                {0,0,0,0,0,0,0,0,0},
                                {0,0,0,0,0,0,0,1,0},
                                {0,0,0,0,0,0,0,0,9},
                                {0,0,0,0,0,0,0,0,0},
                            };

    public int[] getShortestPath() {
        int dist[] = {0,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE};
        PriorityQueue <Pair> pq = new PriorityQueue<>((x, y)-> {return x.getValue() - y.getValue();});
        for (int i=0;i<9;i++){
            String nodeName = Character.toString((char) 65 + i);
            int v = i == 0 ? 0 : Integer.MAX_VALUE;
            Pair p = new Pair(nodeName, v, i);
            pq.add(p);
        }

        while(!pq.isEmpty()) {
            Pair p = pq.poll();
            int index = p.getIndex();
            for(int i=0;i<9;i++){
                if (weightedGraph[index][i] > 0 && dist[index]+weightedGraph[index][i] < dist[i]) {
                    dist[i] = dist[index]+weightedGraph[index][i];
                    pq.add(new Pair(Character.toString((char) 65 + i), dist[i],i));
                }
            }
        }
        return dist;
    }

    public String getShortestPathWithPath() {
        List<String> ans =null;
        int dist[] = {0,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE};
        PriorityQueue <Pair> pq = new PriorityQueue<>((x, y)-> {return x.getValue() - y.getValue();});
        for (int i=0;i<9;i++){
            String nodeName = Character.toString((char) 65 + i);
            int v = i == 0 ? 0 : Integer.MAX_VALUE;
            Pair p = new Pair(nodeName, v, i);
            pq.add(p);
        }

        while(!pq.isEmpty()) {
            Pair p = pq.poll();
            int index = p.getIndex();
            for(int i=0;i<9;i++){
                if (weightedGraph[index][i] > 0 && dist[index]+weightedGraph[index][i] < dist[i]) {
                    dist[i] = dist[index]+weightedGraph[index][i];
                    Pair pp = new Pair(Character.toString((char) 65 + i), dist[i],i);
                    pp.getL().addAll(p.getL());
                    pp.getL().add(p.getKey());
                    pq.add(pp);
                    if(pp.getIndex() == 8){
                        ans = pp.getL();
                    }
                }
            }
        }

        return ans.toString();
    }
}
