import java.io.*;
import java.util.*;

public class problem1157 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.next().toUpperCase();
        int alpha [] = new int [26];
        int max;
        int index=-1;
        int flag=0;
        char here;

        for(int i=0; i<word.length(); i++){
            here = word.charAt(i);
            alpha[here-'A']++;
        }

        max = -1;
        for(int k=0; k<alpha.length; k++){
            if(alpha[k] > max){
                max = alpha[k];
                index = k;
                flag=0;
            }

            else if(alpha[k] == max){
                flag = 1;
            }
        }

        if(flag != 1) {
            System.out.print((char)(index+'A'));
        }
        else{
            System.out.print("?");
        }
    }
}
