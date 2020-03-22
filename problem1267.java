import java.io.*;
import java.util.*;

public class problem1267 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a = 0;
        int Y=0;
        int M=0;
        for(int i=0; i<t; i++){
            a = sc.nextInt();
            Y += (a/30+1) * 10;
            M += (a/60+1) * 15;
        }

        if(Y > M){
            System.out.println("M " + M);
        }
        else if(Y == M){
            System.out.println("Y M " + M);
        }
        else if(Y < M){
            System.out.println("Y " + Y);
        }
    }
}
