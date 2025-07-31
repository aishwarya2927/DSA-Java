package SigmaDSACode;
import java.util.*;


public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int N = sc.nextInt();
         isPrimeNum(N);
    }
    public static void isPrimeNum(int num) {
        if (num == 2) {
            System.out.println("Prime");
        } else if (num > 2) {
            for (int i = 2; i < (num - 1); i++) {
                if (num % i == 0) {
                    System.out.println("Not Prime");
                    break;
                } else {
                    System.out.println("Prime");
                    break;
                }
            }
        }
    }
}
