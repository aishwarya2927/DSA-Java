public class FirstOccurence {
    public static int firstOccurence(int arr[], int target, int i){
          if(i == arr.length){
              return -1;
          }
          if(arr[i] == target){
              return i;
          }
        return firstOccurence(arr,target,i+1);
    }

    public static int lastOccurence(int arr[], int target, int x){
              if(x==arr.length){
                  return -1;
              }
              if(arr[x] == target){
                  return x;
              }
             return lastOccurence(arr,target,x-1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,2,5,6,7,6};
        int target = 6;
        System.out.println(firstOccurence(arr,target,0));
        int x = arr.length-1;
        System.out.println(lastOccurence(arr,target,x));

    }
}
