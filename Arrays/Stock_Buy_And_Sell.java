package SigmaDSACode;

public class Stock_Buy_And_Sell {

    public static int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int idx1 = 0;
        int idx2 = 0;

        for(int i  = 0; i<prices.length; i++){
            if(min > prices[i]){
                min = prices[i];
                idx1 = i;
            }
        }
        System.out.println(min);
        System.out.println(idx1);
        for(int i = idx1+1; i < prices.length; i++){
            if(max < prices[i]){
                max = prices[i];
                idx2 = i;
            }
        }
        System.out.println(max);
        System.out.println(idx2);


        if(idx1 < idx2){
            return prices[idx2] - prices[idx1];
        }
        else{
            return 0;
        }

    }
    public static void main(String[] args) {

        int prices[] = {7,1,5,3,6,4};

        System.out.println(maxProfit(prices));

    }
}
