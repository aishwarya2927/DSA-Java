package SigmaDSACode;

public class Hollow_Rectangle {
    public static void main(String[] args) {
        hollowRectangle(5,5);
        hollowRectanglePattern(5,5);
    }

    //*****
    //*   *
    //*   *
    //*****
    public static void hollowRectangle(int rows, int cols){
        for(int i=1; i<=rows; i++){   //rows
            for(int j=1; j<=cols; j++){   //cols
                if(i==1 || j==1 || i==rows|| j==cols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void hollowRectanglePattern(int rows, int cols){
    //     *****
    //    *   *
    //  *   *
    // *****
        for(int i=1; i<=rows; i++){
            //spaces
            for(int j=1; j<=cols-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=cols; j++){
                if(i==1|| i==rows || j==1|| j==cols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
