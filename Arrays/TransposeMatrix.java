package SigmaDSACode;

import java.util.Scanner;

public class TransposeMatrix {

    public static void transpose(int mat[][], int m, int n) {
        int tranMat[][] = new int[m][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter row and column size for the matrix:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int mat[][] = new int[m][n];
        System.out.println("ENter matrix elements:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix:");
        transpose(mat, m, n);


        int tranMat[][] = new int[m][n];


        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                tranMat[j][i] = mat[i][j];
            }
        }
        System.out.println("Transposed Matrix:");
        transpose(tranMat,  m, n);




    }
}