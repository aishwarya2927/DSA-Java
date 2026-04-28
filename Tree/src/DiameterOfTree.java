public class DiameterOfTree {
    class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            this.right = right;
            this.left = left;
            this.data = data;
        }
    }
    static class Info{
        int diam;
        int ht;
        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static Info diameter(Node root){


         Info lInfo = diameter(root.left);
         Info rinfo = diameter(root.right);


return lInfo;

    }
    public static void main(String[] args) {

    }
}
