import java.io.*;
import java.util.*;

public class problem1371 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] alpha = new int [26];
        int max=0;

        while(sc.hasNextLine()){
            String assay = sc.nextLine();
            for(int i=0; i<assay.length(); i++){
                if(assay.charAt(i) != ' '){
                    alpha[assay.charAt(i)-'a']++;
                    if(max < alpha[assay.charAt(i)-'a']){
                        max = alpha[assay.charAt(i)-'a'];
                    }
                }
            }
        }

        for(int k=0; k<alpha.length; k++){
            if(alpha[k] == max){System.out.print((char)(k+'a'));}
        }

    }
}
