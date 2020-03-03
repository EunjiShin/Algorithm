import java.util.*;
import java.io.*;

public class problem4153 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c;
       double a2, b2, c2;

        while(true){
            int max = 0;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            if((a==0) && (b==0) && (c==0)){
                break;
            }

            a2 = Math.pow(a, 2);
            b2 = Math.pow(b, 2);
            c2 = Math.pow(c, 2);

            if(a2 == b2+c2){
                System.out.println("right");
            }
            else if(b2 == a2+c2){
                System.out.println("right");
            }
            else if(c2 == b2+a2){
                System.out.println("right");
            }
            else{
                System.out.println("wrong");
            }


        }
    }
}
