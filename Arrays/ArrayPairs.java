package SigmaDSACode;

public class ArrayPairs {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        PairsOfArray(arr);
    }

    public static void PairsOfArray(int arr[]) {
        int number = arr[0];
        for (int i = 0; i < arr.length; i++) {
            number = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + number + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }
}//
