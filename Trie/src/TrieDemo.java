public class TrieDemo {

    static class Node{
        Node child[] = new Node[26];
        boolean eow = false;  //End of Word

        Node(){
            for(int i = 0; i<26; i++){
                child[i] = null;
            }
        }
    }
    public static Node root = new Node();
    public static void insert(String word){   //O(L)
        Node curr = root;
        for (int level = 0; level < word.length(); level++){
            int idx = word.charAt(level) - 'a';

            if(curr.child[idx] == null){
                curr.child[idx] = new Node();
            }
            curr = curr.child[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String key){
        Node curr = root;
        for(int level = 0; level<key.length();level++){
            int idx  = key.charAt(level)-'a';
            if(curr.child[idx] == null){
                return false;
            }
            curr = curr.child[idx];
        }
        return curr.eow == true;
    }
    public static void main(String[] args) {

        String words[] = {"the", "a", "there","their","any","thee"};
        for(int i = 0;i<words.length; i++){
            insert(words[i]);
        }

        System.out.println(search("thee"));
        System.out.println(search("thor"));
    }
}
