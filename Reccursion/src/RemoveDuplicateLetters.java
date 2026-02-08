public class RemoveDuplicateLetters
{
    public static void removeDuplicates(String s, int idx, StringBuilder sb, boolean map[]) {
//              base case
                if(idx == s.length()){
                    System.out.println(sb);
                    return;
                }
                char currChar = s.charAt(idx);
                if(map[currChar - 'a'] == true){
//                    current character is duplicate
                    removeDuplicates(s, idx+1, sb, map);
                }
                else{
                    map[currChar - 'a'] = true;
                    removeDuplicates(s, idx + 1, sb.append(currChar), map);
                }
            }
    public static void main(String[] args) {
        String str = "apnaacollege";
     removeDuplicates(str,0, new StringBuilder(""), new boolean[26] );

            }
    }

