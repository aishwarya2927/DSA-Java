import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

class Edge {
    int src;
    int dest;

    Edge(int s, int d) {
        this.src = s;
        this.dest = d;
    }
}

public class KosarajuAlgoSCC {

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]){
        vis[curr] = true;
        System.out.print(curr+" ");

        for(int i = 0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph, e.dest, vis);
            }
        }
    }

    public static void Kosaraju(ArrayList<Edge> graph[], int V){
        Stack<Integer> s = new Stack<>();
        boolean vis[]  = new boolean[V];

        for(int i = 0; i<V; i++){
            if(!vis[i]){
                topSort(graph, i, vis, s);
            }
        }

//        Step 2:
        ArrayList<Edge> transpose[] = new ArrayList[V];
        for(int i = 0; i<graph.length; i++){
            vis[i] = false;
            transpose[i] = new ArrayList<Edge>();
        }

        for(int i = 0; i<V; i++){
            for(int j = 0; j<graph[i].size(); j++){
                Edge e = graph[i].get(j);   //e.src -----> e.dest
                transpose[e.dest].add(new Edge(e.dest, e.src));  //reverse edge
            }
        }

//        step 3:
        while(!s.isEmpty()){
            int curr = s.pop();
            if(!vis[curr]){
                System.out.println("SCC");
                dfs(transpose, curr, vis);
                System.out.println();
            }
        }
    }





    public static void topSort(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> s){
        vis[curr] = true;
        for(int i = 0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                topSort(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    }
    public static void main(String[] args) {
//        Kosaraju's ALgo is used to find strongly connected components in a directed graph

//        it has 3 fixed steps:
//        1. Get nodes in a stack using Topological Sort
//        2. Transpose the graph (for this create a new graph
//        in which you have to simply reverse the edges between nodes
//        src<---->dest)
//        3. Do dfs accprding to stack nodes on the transpose graph

//        The idea is to simply perform reverse dfs on the graph and you
//        will get the strongly connected component of the graph

        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        // Example graph
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 1));
        graph[3].add(new Edge(3, 4));

        Kosaraju(graph, V);
    }
}
