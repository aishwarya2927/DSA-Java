public class Factorial {

    public static int findFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = findFactorial(n - 1);
        int fn = n * findFactorial(n - 1);
        return fn;
    }

    public static void main(String[] args) {
//        n! = n*(n-1)!  ---->   f(n) = n*f(n-1)

        int fact = 5;
        int result = findFactorial(fact);
        System.out.println(result);

    }
}
