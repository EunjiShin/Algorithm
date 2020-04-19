import java.io.*;
import java.util.*;
import java.lang.*;

public class problem1259 {
   static boolean Palindrom(int num){
        int index = (int)(Math.log10(num)+1);
        char [] array= new char [index];
        String k = Integer.toString(num);

        for(int i=0; i<array.length; i++){
            array[i] = k.charAt(i);
        }
        int j=0;
        int u = array.length-1;

        while(j<u){
            if(array[j] != array[u]){return false;}
            j++;
            u--;
        }
        return true;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int num = sc.nextInt();
            if(num == 0){ break; }
            if(Palindrom(num) == true){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }

        return;
    }
}
