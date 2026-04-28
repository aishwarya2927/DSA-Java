//public class BinarySearchTree {
//
//    public static class Node{
//        int value;
//        Node left;
//        Node right;
//        int height;
//        Node root;
//        public Node(int value){
//            this.value = value;
//            this.right = null;
//            this.left = null;
//            this.height = height;
//        }
//    }
//
//    public static void insert(int value){
//       Node  root = new insert( value, root);
//    }
//
//    public static Node insert(int value, Node node){
//        if(node == null){
//            node = new Node(value);
//            return node;
//        }
//
//        if(value < node.value){
//            node.left = insert(value, node.left);
//        }
//
//        if(value > node.value){
//            node.right = insert(value, node.right);
//        }
//        node.height = Math.max(height(node.left), height(node.right))+1;
//        return node;
//    }
//
//
//    public static int height(Node root){
//        if(root == null){
//            return 0;
//        }
//        int lh = height(root.left);
//        int rh = height(root.right);
//        int height = Math.max(lh, rh) +1;
//        return height;
//    }
//
//
//    public static void main(String[] args) {
//       BinaryTree tree = new BinaryTree();
//       Node root = new Node(0);
////       tree.insert(root, 15);
//
//
//
//
//    }
//}
