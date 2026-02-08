public class PowerClculate {
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
//        int xnm1 = power(x, n-1);
//        int xn = x * xnm1;
//        return xn;
        return x * power(x,n-1);
    }
    public static int optimizedPower(int a, int n){
        if(n == 0){
            return 1;
        }
        int halfPower = optimizedPower(a,n/2);
        int halfPowersq = halfPower * halfPower;
        if(n%2!= 0){
            halfPowersq = a * halfPowersq;
        }
        return halfPowersq;
    }
    public static void main(String[] args) {
        System.out.println(power(2,10));
        System.out.println(optimizedPower(2,10));
    }
}
