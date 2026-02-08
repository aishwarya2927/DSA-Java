public class Practice_Questions {
//    Question1:For a given integer array of sizeN.You have to find all the occurrences(indices)
//    of a given element(Key)and print them.
//    Use a recursive function to solve this problem

    public static void printOccurences(int n[], int key, int i){

        if(i == n.length){
            return;
        }
        if(key == n[i]){
            System.out.print(i+" ");
        }
        printOccurences(n,key,i+1);
    }

//Question 2 :You are given a number (eg -  2019),
// convert it into a String of english like“two zero one nine”.
// Use a recursive function to solve this problem.
//  NOTE-Thedigitsofthenumberwillonlybeintherange0-9andthelastdigitofanumbercan’t be 0.

    public static void printNumber(int num){
        String arr[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
         if(num == 0){
             return;
         }
       int  lastDigit = num % 10;
         printNumber(num/10);
        System.out.print(arr[lastDigit]+" ");

    }

//    find the length of string using reccursion

    public static int lenString(String str){

         if(str.equals("")){
             return 0;
         }
      return lenString(str.substring(1))+1;


    }


    public static void main(String[] args) {
        int n[] = {2,4,3,1,2,4,5,2,3,2};
        int key = 2;
        printOccurences(n, key, 0);

        int num = 1921;
        printNumber(num);

        String str = "aabsc";
        System.out.println("Length of "+str+ " "+ lenString(str));
    }
}
