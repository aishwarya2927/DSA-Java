import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
//    Preorder Binary Tree
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left  = null;
            this.right = null;
        }
    }

    static class CreateTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preorderPrint(Node root){
             if(root == null){
                 System.out.print(-1+" ");
                 return;
             }
            System.out.print(root.data+" ");
             preorderPrint(root.left);
             preorderPrint(root.right);

//       -----------Inorder Traversal-------------
//            preorderPrint(root.left);
//            System.out.print(root.data+" ");
//            preorderPrint(root.right);
        }

        public static void levelOrder(Node root){
            if(root==null){
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }

//        Height of the tree
        public int heightOfTree(Node root){
            if(root == null){
                return 0;
            }

            int  lh = heightOfTree(root.left);
            int rh = heightOfTree(root.right);
            int height = Math.max(lh, rh) +1;

            return height;
        }

        public int countNodes(Node root){
            if(root == null){
                return 0;
            }

            int lcount = countNodes(root.left);
            int rcount = countNodes(root.right);
            int count = lcount + rcount +1;

            return count;
        }

        public int sumNodes(Node root){
            if(root == null){
                return 0;
            }

           int lsum = sumNodes(root.left);
           int rsum = sumNodes(root.right);
           int sum = lsum + rsum + root.data;

            return sum;
        }
    }
    public static void main(String[] args) {
            int nodes[] = {1, 2, 4, -1, -1, 5, -1 , -1, 3, -1, 6, -1, -1};
            CreateTree tree = new CreateTree();
            Node root = tree.buildTree(nodes);

        System.out.println("Root "+root.data);
        System.out.println("Preorder traversal");
        tree.preorderPrint(root);
        System.out.println();
        System.out.println("Level order traversal");
        tree.levelOrder(root);
        System.out.println("Height of tree");
        System.out.println(tree.heightOfTree(root));
        System.out.println("No of nodes in tree");
        System.out.println(tree.countNodes(root));
        System.out.println("Sum of Tree nodes");
        System.out.println(tree.sumNodes(root));

    }
}
