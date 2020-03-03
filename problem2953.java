import java.util.*;
import java.io.*;

public class problem2953 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num [][] = new int [5][4];
        int max = 0;
        int sum = 0;
        int n = 0;

        for(int i=0; i<5; i++){
            for(int j=0; j<4; j++){
                num[i][j] = sc.nextInt();
                sum += num[i][j];
            }
            if(sum > max){
                max = sum;
                n = i+1;
            }
            sum = 0;
        }

        System.out.print(n + " " + max);
    }
}
