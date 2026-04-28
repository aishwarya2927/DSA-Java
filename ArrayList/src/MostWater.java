public class MostWater {

// 11.   Container with most water  (Leetcode)  --> # FLIPCART
//We have solved this question using ArrayList on Leetcode
// 1 Brute Force
    public static void mostWater(int arr[]){
        int max = Integer.MIN_VALUE;
        int water = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                int l1 = arr[i];
                int l2 = arr[j];
                int height = Math.min(l1, l2);
                int width = j-i;
                water = height * width;
            }
            if(max < water){
                max = water;
            }
        }
        System.out.println(max);
    }

//    2 Pointer Approach
    public static void twoPointer(int height[]){
        int maxwater = 0;
        int water = 0;
        int lp = 0;
        int rp = height.length-1;


        while(lp < rp){

            int hei = Math.min(height[lp],height[rp]);
            int width = rp - lp;
            water = hei * width;
            maxwater = Math.max(maxwater, water);

            if(height[lp] < height[rp] ){
                lp++;
            }
            else{
                rp--;
            }
        }
        System.out.println(maxwater);

    }
    public static void main(String[] args) {
       int height[] =  {1,8,6,2,5,4,8,3,7};
       mostWater(height);
       twoPointer(height);
    }

}
