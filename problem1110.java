import java.io.*;
import java.util.*;

public class problem1110 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num, count;
        int a,b, cycle=0;

        num = sc.nextInt();
        a = num/10;
        b = num%10;

        while(true) {
            cycle++;
            count = b;
            b = (a+b)%10;
            a = count;
            if(num == a*10 + b){
                break;
            }
        }

        System.out.println(cycle);

    }
}
