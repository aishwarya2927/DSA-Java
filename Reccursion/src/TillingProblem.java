public class TillingProblem {

//    Tilling Problem
//    Given a "2 * n" board and tiles of size "2 * 1",
//    count the number of ways to tile the given board using
//    the 2*1 tiles.
//    (A tile can either be placed horizontally or vertically)

    public static int tilling(int n){
        if(n == 0|| n==1 ){
            return  1;

        }
        int fnm1 = tilling(n-1);

        int fnm2 = tilling(n-2);

        int totalWays = fnm1 + fnm2;

        return totalWays;
    }
    public static void main(String[] args) {
        int n = 4;
  System.out.println(" Total number of ways to place the tiles : "+tilling(n));
    }
}
