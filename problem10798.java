import java.io.*;
import java.util.*;

public class problem10798 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        char [][] text = new char [15][15];
        String num = "";

        for(int i=0; i<5; i++){
                String a = sc.nextLine().trim();
                for(int k=0; k<a.length(); k++){
                    text[i][k] = a.charAt(k);
                }
        }


        for(int i=0; i<15; i++){
            for(int j=0; j<15;j++){
                if(text[j][i] != '\0'){
                    num += Character.toString(text[j][i]);
                }
            }
        }

        System.out.println(num);
    }
}
