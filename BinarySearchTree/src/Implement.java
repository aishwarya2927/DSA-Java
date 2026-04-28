public class Implement {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

        public static Node insert(int data, Node root) {

            if (root == null) {
                root = new Node(data);
                return root;
            }
            if (root.data > data) {
              root.left =  insert(data, root.left);
            } else {
              root.right = insert(data, root.right);
            }
            return root;

        }

        public static void inorder(Node root){
        if(root == null){
            return ;
        }

            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);


        }

        public static void main(String[] args) {
            int values[] = {5, 1, 3, 4, 2, 7};

            Node root = null;


            for (int i = 0; i < values.length; i++) {
                root = insert(values[i], root);
            }

             inorder(root);
        }

}
