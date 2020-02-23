import java.io.*;
import java.util.*;

public class problem2775 {

    public static int Sum(int m, int x){
        if(x==0){return 0;}
        if(m == 0){return x;}
        else{
            return Sum(m, x-1) + Sum(m-1, x);
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int k, n;
        int sum = 0;

        for(int j=0; j<T; j++){
            k = sc.nextInt();
            n = sc.nextInt();
            System.out.println(Sum(k, n));
        }
    }
}
