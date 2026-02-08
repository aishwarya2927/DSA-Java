import java.util.Scanner;

public class BasicReccursion {
//        Print numbers from 1 to 10 using recurssion
    public static void printNumbers(int N){
        if(N==1){
            System.out.print(N+" ");
            return;
        }
        printNumbers(N-1);
        System.out.print(N+" ");
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 10;
        printNumbers(n);
    }
}
