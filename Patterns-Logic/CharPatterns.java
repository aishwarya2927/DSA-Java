package SigmaDSACode;
import java.lang.*;


public class CharPatterns {
    public static void main(String[] args){
        char ch = 'A';
        int n=4;
        for(int i=1; i<=n; i++){
             for(int j=1; j<=i; j++){
                 System.out.print(ch);
                ch++;
             }
            System.out.println();
        }
        System.out.println();
//        triangle pattern
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
//        invert triangle
        for(int i=1; i<=4; i++){
            for(int j=4; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for(int i=1; i<=4; i++){
            for(int j=1; j<=(4-i)+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        int a=1;
        for(int i=1; i<=5;i++){

            for(int j=1; j<=i; j++ ){
                System.out.print(a);
                if(a==1){
                    a=0;
                }else{
                    a=1;
                }
            }
            System.out.println();
        }
    }
}
