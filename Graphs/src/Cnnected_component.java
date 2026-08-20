import java.util.ArrayList;
public class Cnnected_component {
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


    public static void dfs(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                System.out.print("Component: ");
                dfs_util(graph, vis, i);
                System.out.println();
            }
        }
    }
    public static void dfs_util(ArrayList<Edge>[] graph, boolean[] vis, int curr) {

        vis[curr] = true;
        System.out.print(curr + " ");

        for (Edge e : graph[curr]) {
            if (!vis[e.dest]) {
                dfs_util(graph, vis, e.dest);
            }
        }
    }
    public static void main(String[] args) {

        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        for(int i = 0; i<V; i++){
            graph[i] = new ArrayList<>();
        }
        //        0----vertex
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
    }
}
