import java.util.LinkedList;

public class GraphImpleYT {

        private LinkedList<Integer> adj[];

        public GraphImpleYT(int v){
            adj = new LinkedList[v];
            for(int i = 0; i<v; i++){
                adj[i] = new LinkedList<Integer>();
            }
        }

        public void addEdge(int sorce, int dest){
            adj[sorce].add(dest);
            adj[dest].add(sorce);
        }

    public static void main(String[] args) {

    }
}
