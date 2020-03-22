import java.io.*;
import java.util.*;

public class problem2420 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c;

        if(a>=b){c = a-b;}
        else{c = b-a;}
        System.out.println(c);
    }
}

