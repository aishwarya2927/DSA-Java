package SigmaDSACode;
import java.util.*;

import java.util.Scanner;

public class nonRestoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dividend (>=0): "); int dividend = sc.nextInt();
        System.out.print("Divisor  (>0) : "); int divisor  = sc.nextInt();
        if (dividend < 0 || divisor <= 0) {
            System.out.println("Use non-negative dividend and positive divisor.");
            return;
        }

        int n = 1;
        while ((1 << n) <= dividend) n++;
        if (n == 0) n = 1;

        long A = 0;
        int Q = dividend;
        int M = divisor;

        for (int i = 0; i < n; i++) {
            A = (A << 1) | ((Q >> (n - 1)) & 1);
            Q = (Q << 1);
            if (A >= 0) A = A - M;
            else         A = A + M;

            if (A >= 0) Q = Q | 1; // set last bit 1
            // else last bit remains 0
        }

        if (A < 0) A = A + M; // final correction
        int quotient = Q & ((1 << n) - 1);
        int remainder = (int) A;

        System.out.println("Quotient : " + quotient);
        System.out.println("Remainder: " + remainder);
        System.out.println("Check (div): " + (dividend / divisor) + ", (mod): " + (dividend % divisor));
    }
}
