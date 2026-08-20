//public class UniqueSubstr {
//    class Solution {
//        static class Node {
//            Node child[] = new Node[26];
//            boolean eow = false;
//
//
//            Node() {
//                for (int i = 0; i < 26; i++) {
//                    child[i] = null;
//
//                }
//            }
//        }
//
//        public static Node root = new Node();
//
//        public int uniqueLetterString(String s) {
//            for (int i = 0; i < s.length(); i++) {
//                String suffix = s.substring(i);
//                insert(suffix);
//            }
//
//            int count = count(root);
//            return count+1;
//        }
//
//        public static void insert(String s) {
//            Node curr = root;
//            for (int i = 0; i < s.length(); i++) {
//                int idx = s.charAt(i) - 'a';
//
//                if (curr.child[idx] == null) {
//                    curr.child[idx] = new Node();
//                }
//                curr = curr.child[idx];
//            }
//            curr.eow = true;
//        }
//
//        public static int count(Node root) {
//            if (root == null) {
//                return 0;
//            }
//            int count = 0;
//            for(int i = 0;i<26;i++ ){
//                if(root.child[i] !=null){
//                    count = count(root.child[i]);
//                }
//            }
//
//            return count;
//
//        }
//    }
//}
