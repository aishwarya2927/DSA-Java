package SigmaDSACode;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 20};
        int key = 4;
        Arrays.sort(arr); // Sort the array before binary search
        int res = binarySearch(arr,key);
        if(res==-1){
            System.out.println("Not Found");
        }else{
            System.out.println("Key found at : ");
            System.out.println(res);
        }
    }

    public static int binarySearch(int numbers[], int key){
        int first = 0;
        int last = numbers.length-1;
        while(first<=last){
            int mid = (first+last)/2;
            if(numbers[mid]==key){
                return mid;
            }else if(mid>key){
                last = mid-1;
            }else{
                first = mid+1;
            }
        }
        return -1;
    }
}
