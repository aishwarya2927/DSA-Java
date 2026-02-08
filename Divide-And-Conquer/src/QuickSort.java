public class QuickSort {

    public static void printArr(int arr[]){
      for(int i=0; i<arr.length; i++){
          System.out.print(arr[i]+" ");
      }
        System.out.println();
    }
    public static void quickSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx-1);  //left
        quickSort(arr, pIdx+1,ei);   //right
        }

    public static int partition(int arr[],int si, int ei) {
        int pivot = arr[ei];
        int j = si-1; //to make place for ele smaller than pivot
        for (int i = si; i < ei; i++) {
            if (arr[i] <= pivot) {
                j++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }
        }
        j++;
        int temp = pivot;
        arr[ei] = arr[j];
        arr[j] = temp;
        return j;
    }

    public static void main(String[] args) {
       int arr[] = {3,2,4,5,2,5};
       int pivot = arr[arr.length-1];
       quickSort(arr, 0,arr.length-1);
       printArr(arr);
    }
}
