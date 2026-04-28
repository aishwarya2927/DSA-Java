//import java.awt.font.TextHitInfo;
//import java.util.ArrayList;
//import java.util.LinkedList;
//
//public class BFS {
//    public static class TreeNode{
//        int data;
//        TreeNode left;
//        TreeNode right;
//        TreeNode(int data){
//            this.data = data;
//            this.left = left;
//            this.right = right;
//
//        }
//    }
//
//    public static List<List<Integer>> levelOrder(TreeNode root){
//            List<List<Integer>> result = new ArrayList<>();
//
//        if(root == null){
//            return result;
//        }
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//
//        while(!queue.isEmpty()){
//            int levelSize = queue.size();
//           List<Integer> currlevel = new ArrayList<>(levelSize);
//
//            for(int i = 0; i< levelSize; i++){
//                TreeNode currNode = queue.poll();
//                currlevel.add(currNode);
//
//                if(currNode.left != null){
//                    queue.offer(currNode.left);
//                }
//                if(currNode.right != null){
//                    queue.offer(currNode.right);
//                }
//            }
//
//
//        }
//
//
//
//    }
//
//    public static void main(String[] args) {
//
//    }
//}
