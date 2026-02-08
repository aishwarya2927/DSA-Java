public class printSum {

    public static int printSumofNaturalNum(int n){
        if(n == 1){
            return 1;
        }
        int sn1 = printSumofNaturalNum(n-1);
        int sn = n + sn1;
        return sn;
    }

    public static void main(String[] args) {
        int num = 5;
       int result =  printSumofNaturalNum(num);
        System.out.println(result);
    }
}
