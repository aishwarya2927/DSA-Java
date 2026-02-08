public class Sample {

    public static void print(int N, int i){
       if(i>N){
           return;
       }
        print(N,i+1);
        System.out.println(i+" ");

    }
    public static void main(String[] args) {
        int N = 3;
        print(N,1);

    }
}
