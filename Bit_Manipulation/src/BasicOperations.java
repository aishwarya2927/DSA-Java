public class BasicOperations {

// 1   Given a number N find if it is odd or even
//    0000  ->0
//    0001   ->1
//    0010  ->2
//    0011  ->3
//    0100  ->4
//    0101   ->5
//    0110   ->6
//    0111   ->7
//    1000   ->8
//    1001   ->9
//    1010   ->10

//    if 2^0 place is 1 the number is odd else it is even

//    That means N & 1 == 1 -----> odd else even
//    e.g. 1010 & 0001 ---->  0000  so 10 is even
//    e.g. 1001 & 0001 ---->  0001  so 9 is odd

    public static boolean idOdd(int n){
        return (n & 1) == 1;
    }
    public static boolean isEven(int n){
        return (n & 1) == 0;
    }



//    Given an array of numbers in which every element appears twice but
//    only one number appears once find that one
//    arr = [2,3,4,1,2,1,3,6,4]  ----> return 4

//    we know that any number xor with the same number gives 0 but
//    if it is xor with 0 it gives that number itself
//    1 ^ 1 == 0 but 1 ^ 0 == 1

//    so we came up to the solution that xor the entire array
//    duplicate elements would be 0 and unique will remain only

    public static int isUnique(int arr[]){
        int i = 0;
        for( i = 0; i< arr.length; i++) {
            arr[i] ^= 0;
        }
        return i;
    }



//    Find i^th bit of a number
//    e.g. 10110110  find 5th bit ----> 1
//    And the number with 1 it will give
//     10110110 & 00010000->(Mask)   = 00010000
//     how do we mask ??
//   so N << (N-1) will add N-1 0 at the right side of N

//   so the ans would be----> N & (1 << (N-1))
    public static int iThBit(int n, int i){
        return n & (1<<i-1);
    }

//    set ith bit
//    OR it with N
//    1010110 | 0001000-->(Mask)  = 1011110



//    Reset ith Bit


//    Find the position of the right most set bit
//    ex .N = 10110110  ans --> 2
//    how ??
//    N = a | b
//


    public static void main(String[] args) {
//        Even or add
        int n  = 67;
        System.out.println(isEven(n));
        System.out.println(idOdd(n));

//        unique element
        int arr[] = {2,3,3,4,2,6};
        System.out.println(isUnique(arr));

//        ith bit of a number
        System.out.println(iThBit(10110110, 5));

//     set the ith Bit
    }
}
