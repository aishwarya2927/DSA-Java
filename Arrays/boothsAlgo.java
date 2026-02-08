package SigmaDSACode;
import java.util.Scanner;

public class boothsAlgo {
    // helper to show signed value of a 2n-bit result
    static long toSigned(long val, int bits) {
        long top = 1L << (bits - 1);
        if ((val & top) != 0) return val - (1L << bits);
        return val;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Multiplicand (m): ");
        int m = sc.nextInt();
        System.out.print("Multiplier   (r): ");
        int r = sc.nextInt();
        System.out.print("Number of bits (n, e.g. 8 or 16): ");
        int n = sc.nextInt();

        // masks for n-bit arithmetic
        int maskN = (n >= 31) ? -1 : ((1 << n) - 1);     // careful for n==31/32
        long mask2n = (n * 2 >= 63) ? ~0L : ((1L << (2 * n)) - 1L);

        // represent inputs in n-bit two's complement form
        int M = m & maskN;
        int Q = r & maskN;
        int A = 0;
        int Q_1 = 0;

        // Booth algorithm loop
        for (int i = 0; i < n; i++) {
            int q0 = Q & 1;
            if (q0 == 1 && Q_1 == 0) {        // 10 -> A = A - M
                A = (A - M) & maskN;
            } else if (q0 == 0 && Q_1 == 1) { // 01 -> A = A + M
                A = (A + M) & maskN;
            }

            // Arithmetic right shift of [A (n bits), Q (n bits), Q_1]
            int newQ1 = Q & 1;

            // get sign bit of A (n-bit)
            int signA = (A >> (n - 1)) & 1;

            // shift Q right, bring low bit of A into MSB of Q
            Q = (Q >>> 1) | ((A & 1) << (n - 1));

            // shift A right, fill MSB with signA (arithmetic)
            A = (A >>> 1) | (signA << (n - 1));
            A &= maskN; // keep n bits

            Q_1 = newQ1;
        }

        // combine A and Q into 2n-bit product (unsigned layout)
        long productUnsigned = (((long) A & maskN) << n) | ((long) Q & maskN);
        productUnsigned &= mask2n;

        // interpret 2n-bit result as signed
        long productSigned = toSigned(productUnsigned, 2 * n);
        System.out.println("Product  " + productSigned);

    }
}
