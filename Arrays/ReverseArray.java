package SigmaDSACode;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {10,4,2,8,3};
        reverseElements(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void reverseElements(int arr[]){
        int start = 0;
        int last = arr.length-1;

        while (start<last){
            int temp = arr[last];
            arr[last] = arr[start];
            arr[start] = temp;
             start++;
             last--;
        }


    }
}
