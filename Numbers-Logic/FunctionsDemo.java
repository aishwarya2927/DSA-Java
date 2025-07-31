package SigmaDSACode;
import java.lang.*;
import java.io.*;
import java.util.*;
public class FunctionsDemo {

    public static int AddFun(int a, int b){   //parameters or formal parameters
        int sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = AddFun(10,20);  //arguments or actual parameters
        System.out.println(sum);


    }
}
