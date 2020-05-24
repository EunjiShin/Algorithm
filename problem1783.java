import java.io.*;
import java.util.*;

public class problem1783 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;

        if(n==1){count = 1;}
        else if(n==2){
            int num = (m-1)/2;
            if(num>4){count = 4;}
            else{ count = num;}
        }
        else if(m<7){
            if(4<m){count = 4;}
            else{count = m;}
        }
        else{
            count = m-2;
        }

        System.out.println(count);
    }
}
