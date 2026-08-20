import java.util.ArrayList;
public class Detect_Cycle {
    public static class Edge{
        int src;
        int dest;
        int wt;
        Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }


    public static boolean dfs(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {

                if (detectCycle(graph, vis, i, -1)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean detectCycle(ArrayList<Edge>[] graph, boolean[] vis, int curr, int parent) {

        vis[curr] = true;


        for(int i = 0; i<graph[curr].size() ; i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                if (detectCycle(graph, vis, e.dest, curr))
                    return true;
            } else if (vis[e.dest] && e.dest != parent) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        for(int i = 0; i<V; i++){
            graph[i] = new ArrayList<>();
        }


        //   ---------------------------------------------------------- with cycle ---------------------------------------------------
        //        0----vertex
//        graph[0].add(new Edge(0,1,5));
////        1----vertex
//        graph[1].add(new Edge(1,0,5));
//        graph[1].add(new Edge(1,2,1));
//        graph[1].add(new Edge(1,3,3));
////        2 ------vertex
//        graph[2].add(new Edge(2,1,1));
//        graph[2].add(new Edge(2,3,1));
//        graph[2].add(new Edge(2,4,4));
//
////        3-----vertex
//        graph[3].add((new Edge(3,1,3)));
//        graph[3].add((new Edge(3,2,1)));
//
////        4-----vertex
//        graph[4].add(new Edge(4,2,2));


//   ---------------------------------------------------------- without cycle ---------------------------------------------------
        graph[1].add(new Edge(1,2,1));
        graph[2].add(new Edge(2,1,1));

        graph[1].add(new Edge(1,3,3));
        graph[3].add(new Edge(3,1,3));

        graph[2].add(new Edge(2,4,4));
        graph[4].add(new Edge(4,2,2));



        System.out.println(dfs(graph));
    }
}
