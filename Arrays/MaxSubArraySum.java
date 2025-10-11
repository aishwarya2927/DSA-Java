package SigmaDSACode;
public class MaxSubArraySum {

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


//2nd Method
    public static void prefixSum(int number[]){
        int prefix[] = new int[number.length];
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        prefix[0] = number[0];
        //Calculate prefix sum
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1]+number[i];
        }

        for(int i=0; i<number.length; i++){
            int start = i;

            for(int j = i; j<number.length; j++){
                int end = j;
                currSum =    start==0 ? prefix[end] : prefix[end] - prefix[start-1];

             if(maxSum<currSum)
             {
                 maxSum = currSum;
             }
            }
        }
        System.out.println("Maximum subarray sum = "+ maxSum);
    }

    public static void main(String[] args) {
            int number[] = {1,-2,6,-1,3};
//            printSubSum(number);   //Brute Force
             prefixSum(number);
    }
}
