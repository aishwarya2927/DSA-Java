import javax.swing.tree.TreeNode;

public class KthLevelOfTree {

    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    /*return Kth level elements*/
public void kthElements(Node root, int k, int level){
    if(root == null){
        return;

    }

    if(level == k){
        System.out.print(root.data +" ");
        return;
    }

     kthElements(root.left, k, level+1);
     kthElements(root.right, k, level+1);
}



    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left  =new Node(6);
        root.right.right = new Node(7);

        KthLevelOfTree tree = new KthLevelOfTree();
        tree.kthElements(root, 3, 1);



    }

}
