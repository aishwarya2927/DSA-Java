import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Prims_Algo {

    public static class Edge{
        int wt;
        int src;
        int dest;

        Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    static class Pair implements Comparable<Pair> {
        int v;
        int cost;
        public Pair(int v, int c){
            this.v = v;
            this.cost = c;
        }
        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost;
        }
    }

    public static void prims(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        pq.add(new Pair(0, 0));
        int finalCost = 0;   //MST Total min weight

        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!vis[curr.v]){
                vis[curr.v] = true;

                finalCost += curr.cost;

                for(int i = 0; i<graph[curr.v].size(); i++){
                    Edge e = graph[curr.v].get(i);
                    pq.add(new Pair(e.dest, e.wt));
                }

            }
        }
        System.out.println("Final cost of MST: "+finalCost);
    }
    public static void main(String[] args) {

        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        for(int i = 0; i<V; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,5));
//        1----vertex
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));
//        2 ------vertex
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,4));

//        3-----vertex
        graph[3].add((new Edge(3,1,3)));
        graph[3].add((new Edge(3,2,1)));

//        4-----vertex
        graph[4].add(new Edge(4,2,2));

        prims(graph);
    }
}
