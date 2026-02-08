package SigmaDSACode;

import java.util.Scanner;

public class RotateArray {
    //Rotate an Array by d- counterclockwise or left.
      public static void rotateArray(int arr[], int d){
           int n = arr.length;
          d = d%n; //In case where d > n

           //step 1. reverse first d numbers
          reverse(arr, 0, d-1);

          //step 2. reverse remaining array
          reverse(arr, d,n-1);

          reverse(arr,0,n-1);

      }
   public static void reverse(int array[], int start, int end){
              int temp;
              while(start<end) {
                  temp = array[start];
                  array[start] = array[end];
                  array[end] = temp;
                  start++;
                  end--;
              }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr array Size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Array Elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("How many times do you wanna rotate: ");
        int d = sc.nextInt();

        rotateArray(arr, d);
        System.out.println("Here is your Rotated Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
