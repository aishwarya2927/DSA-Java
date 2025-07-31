package SigmaDSACode;

public class ButterflyPattern {
    public static void main(String[] args) {
        butterflyPattern(4);

    }

//    *     *
//    **   **
//    *** ***
//    *******
//    *******
//    *** ***
//    **   **
//    *     *
    public static void butterflyPattern(int N) {
        //1st half of butterfly
        for(int i=1; i<=N; i++){
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1; j<=2*(N-i); j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //second half of butterfly
        for(int i=N; i>=1; i--){
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1; j<=(2*(N-i)); j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
