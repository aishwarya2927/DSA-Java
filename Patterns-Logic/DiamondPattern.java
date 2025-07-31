package SigmaDSACode;

public class DiamondPattern {
    public static void main(String[] args) {

        diamondPattern(10);

    }

    public static void diamondPattern(int N){
//        1st half portion
        for(int i=1; i<=N; i++){

            //spaces
            for(int j=1; j<=N-i; j++){
                System.out.print(" ");
            }

            //spaces
            for(int j=1; j<(i*2); j++){

                    System.out.print("*");

            }

            System.out.println();
        }

        //2nd half portion
        for(int i=N; i>=1; i--){


            //spaces
            for(int j=1; j<=N-i; j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<(i*2); j++){

                System.out.print("*");

            }

            System.out.println();
        }

    }




}
