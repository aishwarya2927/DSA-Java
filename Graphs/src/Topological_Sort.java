import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Topological_Sort {
    public static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

//    DFS
    public static void topSort(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                topSort_Util(graph, i, vis, s);
            }
        }

        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }

    public static void topSort_Util(ArrayList<Edge>[] graph, int curr,
                                    boolean[] vis, Stack<Integer> s) {

        vis[curr] = true;

        for (Edge e : graph[curr]) {
            if (!vis[e.dest]) {
                topSort_Util(graph, e.dest, vis, s);
            }
        }

        s.push(curr);
    }

//-------------------------------------------------------------
//    BFS
    public static void topSortBfs(ArrayList<Edge> graph[]){
        int indeg[] = new int[graph.length];
        calIndegree(graph, indeg);
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i<indeg.length; i++){
            if(indeg[i] == 0){
                q.add(i);
            }
        }

        while (!q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr + " ");  //print topo sort

            for(int i = 0; i<graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                indeg[e.dest]--;
                if(indeg[e.dest] == 0){
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }

//    Calculate Indegree
    public static void calIndegree(ArrayList<Edge> graph[], int indeg[]){
        for(int i = 0; i<graph.length; i++){
            int v = i;
            for(int j = 0; j<graph[v].size(); j++){
                Edge e = graph[v].get(j);

                indeg[e.dest]++;
            }
        }
    }


    public static void main(String[] args) {

        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // DAG

        // 0
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        // 1
        graph[1].add(new Edge(1, 3, 1));

        // 2
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 1));

        // 3
        graph[3].add(new Edge(3, 5, 1));

        // 4
        graph[4].add(new Edge(4, 5, 1));

        // 5
        graph[5].add(new Edge(5, 6, 1));

        // 6 -> No outgoing edges

        System.out.println("Topological sort using DFS");

        topSort(graph);
        System.out.println();
        System.out.println("Topological sort using BFS");

        topSortBfs(graph);


    }

}