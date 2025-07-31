package SigmaDSACode;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int Number = sc.nextInt();
        int result = sumDigits(Number);
        System.out.println(result);

    }
    public static int sumDigits(int num){

        int rem = 0 , sum =0;
        while(num>=1){
            rem = num % 10;  //access the last digit
            sum = sum+rem;   //adds the lastdigit
            num = num/10;    //removes the last digit
        }
        return sum;
    }
}
