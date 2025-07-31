package SigmaDSACode;

public class RhombusPattern {
    public static void main(String[] args) {
         rhombusPattern(5);
    }

    public static void rhombusPattern(int N){
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=N; j++){
                System.out.print("*");
            }
//            for(int j=1; j<=(N-(N-i)); j++){
//                System.out.print(" ");
//            }
            System.out.println();
        }
    }
}
