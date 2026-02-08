public class Sort_Array_String {
    public static String[] mergeSort(String str[], int si, int ei){
        if(si==ei){
            String[] A = { str[si] };
            return A;
        }

        int mid = si+(ei-si)/2;
      String arr1[] =   mergeSort(str,si,mid);
        String arr2[] = mergeSort(str, mid+1, ei);

      String arr3[] =  merge(arr1, arr2);
      return arr3;
    }

    public static String[] merge(String arr1[], String arr2[]){

        int m = arr1.length;
        int n = arr2.length;
        String[] arr3 = new String[m + n];

        int idx = 0;
        int i = 0;
        int j = 0;

        while(i<m && j< n){

        }



    }
    public static void main(String[] args) {

    }
}
