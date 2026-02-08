public class ShortestPath {
    public static float getPath(String path){
        int x =0;
        int y = 0;
         for(int i=0; i<path.length(); i++){
             char dir = path.charAt(i);

             if(dir == 'S'){
                 y--;
             }
             else if(dir == 'N'){
                 y++;
             }
             else if(dir == 'W'){
                 x--;
             }
             else if(dir == 'E'){
                 x++;
             }
         }
         int x2 = x*x;
         int y2 = y*y;

         float res = (float) Math.sqrt(x2 + y2);
         return res;
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        float SP = getPath(path);
        System.out.println(SP);
    }
}
