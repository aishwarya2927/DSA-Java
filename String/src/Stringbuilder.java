import java.lang.StringBuilder;
public class Stringbuilder {
    public static String changeCase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");

        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }

        System.out.println(sb);
        System.out.println(sb.length());
//        abcdefghijklmnopqrstuvwxyz


//      question
//      conver each first letter of each word of a sententnce to uppercase
//        for ex, "hi i am aishh" --> "Hi I Am Aishh"

        String mystr = "hi, i am aishh";
        System.out.println(changeCase(mystr));

        char alpha = 'a';
        System.out.println(alpha);



    }
}
