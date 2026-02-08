import java.util.Arrays;
import java.util.Scanner;

public class PracticeQuestions {


//    check if both the strings are anagram or not
//    race and care are anagram cause if you replace the letters of one string you can build the other

    public static void anagram(String st1, String st2){

        String str1 = st1.toLowerCase();
        String str2 = st2.toLowerCase();

        if(str1.length() == str2.length()){

            char[] strCharArray1 = str1.toCharArray();
            char[] strCharArray2 = str2.toCharArray();

            Arrays.sort(strCharArray1);
            Arrays.sort(strCharArray2);

            boolean result = Arrays.equals(strCharArray1, strCharArray2);

            if(result){
                System.out.println("Anagram");
            }
            else{
                System.out.println("Not Anagram");
            }

        }
        else{
            System.out.println("Not Anagram");
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        count how many times lowercase vowels occur in the string entered by the user;

        String str = sc.next();
        int count = 0;
        for(char ch = 0; ch<str.length(); ch++){
            if(str.charAt(ch) == 'a' || str.charAt(ch)=='e' || str.charAt(ch)=='i' || str.charAt(ch)=='o' || str.charAt(ch)=='u'){
                count++;
            }
        }
        System.out.println(count);

//        CHeck the output of following code
        String str1 = "Apna";
        String str2 = "College";
        String str3 = "Apna";

        System.out.println(str1.equals(str2) + " " + str1.equals(str3));
        //        false true

        System.out.println(str1.replace("p",""));



//        CHeck if the string is anagram or not
        String s1 = "race";
        String s2 = "care";
        anagram(s1,s2);


    }
}
