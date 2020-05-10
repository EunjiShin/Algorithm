import java.io.*;
import java.util.*;

import static java.util.Arrays.sort;

public class problem1485 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] x_array = new int[4];
        int[] y_array = new int[4];
        double [] num = new double[6];


        for (int m = 0; m < t; m++) {
            for (int i = 0; i < 4; i++) {
                x_array[i] = sc.nextInt();
                y_array[i] = sc.nextInt();
            }

            num[0] = Math.sqrt(Math.pow(Math.abs(x_array[0]-x_array[1]), 2) + Math.pow(Math.abs(y_array[0]-y_array[1]), 2));
            num[1] = Math.sqrt(Math.pow(Math.abs(x_array[0]-x_array[2]), 2) + Math.pow(Math.abs(y_array[0]-y_array[2]), 2));
            num[2] = Math.sqrt(Math.pow(Math.abs(x_array[0]-x_array[3]), 2) + Math.pow(Math.abs(y_array[0]-y_array[3]), 2));
            num[3] = Math.sqrt(Math.pow(Math.abs(x_array[1]-x_array[2]), 2) + Math.pow(Math.abs(y_array[1]-y_array[2]), 2));
            num[4] = Math.sqrt(Math.pow(Math.abs(x_array[1]-x_array[3]), 2) + Math.pow(Math.abs(y_array[1]-y_array[3]), 2));
            num[5] = Math.sqrt(Math.pow(Math.abs(x_array[2]-x_array[3]), 2) + Math.pow(Math.abs(y_array[2]-y_array[3]), 2));

            sort(num);

            if((num[0]==num[1]) && (num[0]==num[2]) && (num[0]==num[3]) && (num[1]==num[2]) && (num[1]==num[3]) && (num[2]==num[3])){
                if(num[4]==num[5]){
                    System.out.println("1");
                }
                else{
                    System.out.println("0");
                }
            }
            else{
                System.out.println("0");
            }


        }

    }

}

