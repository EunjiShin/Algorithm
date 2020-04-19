import java.io.*;
import java.util.*;

public class problem2477 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int max_wid = 0, max_hei=0;
        int wid=0, hei=0;
        int [] array = new int [6];

        for(int i=0; i<6; i++){
            int de = sc.nextInt();
            array[i] = sc.nextInt();
        }

        for(int i=0; i<array.length; i++){
            if(i%2 == 0){
                if(array[i] > max_wid){ max_wid = array[i];}
            }
            else{
                if(array[i] > max_hei){ max_hei = array[i];}
            }
        }

        for(int i=0; i<6; i++){
            if(i%2==0){
                if(array[(i+1)%6]+array[(i+5)%6] == max_hei){
                     wid = array[i];
                }
            }
            else{
                if(array[(i+1)%6]+array[(i+5)%6] == max_wid){
                    hei = array[i];
                }
            }
        }

        System.out.println((max_hei*max_wid-hei*wid)*k);

    }
}
