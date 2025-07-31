package SigmaDSACode;

public class InvertedPyramid {
    public static void main(String[] args) {
             invertedPyramin(4);
             invertedHalfPyramidNumbers(5,5);
             NumbersPyramid(5);
    }

//       *
//      **
//     ***
//    ****
    public static void invertedPyramin(int rows){
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=rows-i; j++){
                System.out.print(" ");

            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static  void invertedHalfPyramidNumbers(int rows, int cols){
        //12345
        //1234
        //123
        //12
        //1

        for(int i=1; i<=rows; i++){
            for(int j=1; j<=(cols-i)+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void NumbersPyramid(int rows){
        //1
        //2 3
        //4 5 6
        //7 8 9 10
        //11 12 13 14 15
        int num=1;
        for(int i=1; i<=rows; i++){

            for(int j=1; j<=i;j++){
                System.out.print(num+" ");
                num++;

            }
            System.out.println();
        }
    }
}
