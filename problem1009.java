import java.io.*;
import java.util.*;

public class problem1009 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a, b;
        int num=0;

        for(int i=0; i<t; i++){
            a= sc.nextInt();
            b = sc.nextInt();
            int result=1;

            for(int k=0; k<b; k++){ result = result * a % 10; }
            if(result == 0){ result=10;}
            System.out.println(result);
        }

    }
}
