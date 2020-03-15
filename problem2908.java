import java.io.*;
import java.util.*;

public class problem2908 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int newa=0;
        int newb=0;

        int a1 = a/100;
        int a2 = a%100/10;
        int a3 = a%10;
        newa = a3*100 + a2*10 + a1;

        int b1 = b/100;
        int b2 = b%100/10;
        int b3 = b%10;
        newb = b3*100 + b2*10 + b1;

        if(newa > newb){
            System.out.print(newa);
        }
        else{
            System.out.print(newb);
        }
    }
}
