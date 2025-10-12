package SigmaDSACode;
import java.math.*;
public class MaxSubArraySum {

//    Three Methods are there for calculating maximum sub array sum

//    1. Brute Force

//    public static void printSubSum(int number[]){
//        int currSum = 0;
//        int maxSum = Integer.MIN_VALUE;
//
//        for(int i=0; i<number.length; i++){
//            int start = i;
//            for(int j=i; j<number.length; j++){
//                int end = j;
//                currSum = 0;
//                for(int k = start; k<=end; k++){
//                    currSum+= number[k];
//                }
//                System.out.println("current Sum "+currSum);
//                if(maxSum < currSum){
//                    maxSum = currSum;
//                }
//            }
//        }
//        System.out.println("Max Sum "+maxSum);
//    }


//2nd Method Prefix Sum

//    public static void prefixSum(int number[]){
//        int prefix[] = new int[number.length];
//        int currSum = 0;
//        int maxSum = Integer.MIN_VALUE;

//        prefix[0] = number[0];
//        //Calculate prefix sum
//        for(int i=1; i<prefix.length; i++){
//            prefix[i] = prefix[i-1]+number[i];
//        }
//
//        for(int i=0; i<number.length; i++){
//            int start = i;
//
//            for(int j = i; j<number.length; j++){
//                int end = j;
//                currSum =    start==0 ? prefix[end] : prefix[end] - prefix[start-1];
//
//             if(maxSum<currSum)
//             {
//                 maxSum = currSum;
//             }
//            }
//        }
//        System.out.println("Maximum subarray sum = "+ maxSum);
//    }


//    3rd. Kadane's Algorithm
//    this is the simplest and efficint smallest efficient code .
//    this algo says that calculate current subarray sum and keep track of maximum sum and if the current sum is -ve then consider it as 0
//    But if whole array is negative then only return maximum sum
    public static void kadanes(int numner[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        int neg = 1;
        int j=0;

//        checking if the whole array is negative
        while(j<numner.length){
            if(numner[j]<0){
               j = j+1;
               neg = -1;
            }else {
                neg = 1;
                break;
            }
        }
//       calculating maximum subarray sum by kadanes algo
        for(int i = 0 ; i<numner.length; i++){
//            for complete negative array
            if(neg<0){
                cs = cs + numner[i];
                ms = Math.max(cs,ms);
            }
//            for normal mix array
            else{
                cs = cs + numner[i];
                if(cs<0){
                    cs = 0;   //considering negative resuult as 0 by kadens algo...
                }
                ms = Math.max(cs , ms);
            }
        }
        System.out.println("Our max subarray sum is :"+ ms);
    }

    public static void main(String[] args) {
//            int number[] = {1,-2,6,-1,3};
//            printSubSum(number);   //Brute Force
//             prefixSum(number);    //prefix sum

        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
//          int numbers[] = {-1,-2,-3,-4};    //negative array
     kadanes(numbers);                // kadane's algo..

    }
}
