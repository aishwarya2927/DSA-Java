package SigmaDSACode;


import java.util.Scanner;

//Write a Java program to check if a number is a palindrome in Java?
// (121 is a palindrome, 321 is not) A number is called a palindrome if the number is equal to the
// reverse of a number e.g. , 121 is a palindrome because the reverse of 121 is 121 itself.
// On the other hand,321 is not a palindrome because the reverse of 321 is 123, which is not equal to 321
public class isPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        isPalindromeNum(N);
    }

    public static void isPalindromeNum(int num){
         int initNum = num;
        int rem=0, rev = 0;
        while(num>=1){
            rem = num % 10;        //access last digit of the number  ex. (121=1)->(12=2)->(1->1)
            rev = (rev * 10)+rem;  //stores the last digit into rev variable  ex.(121=1)->(12)->(121)
            num = num/10;           //removes the last digit         (121=12)->(12=1)->(1=_)

        }
        if(initNum==rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }

    }
}
