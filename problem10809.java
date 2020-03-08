import java.io.*;
import java.util.*;

public class problem10809 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int [] alpha = new int[26];

        for(int m = 0; m<alpha.length; m++){
            alpha[m] = -1;
        }

        for(int k=0; k<input.length(); k++){
            char ab = input.charAt(k);
            if(alpha[ab-97] == -1) {
                alpha[ab - 97] = k;
            }
            else{
                continue;
            }
        }

        for(int i=0; i<alpha.length; i++){
            System.out.print(alpha[i] + " ");
        }

    }
}
