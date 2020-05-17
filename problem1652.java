import java.io.*;
import java.util.*;

public class problem1652 {
    static int garo = 0;
    static int sero = 0;


    public static void find(int n, char[][] array) {
        int tag;
        for(int i=0; i<n; i++){
            tag = 0;
            for(int j=0; j<n-1; j++){
                if(array[j][i] == '.' && array[j+1][i]=='.'){
                    if(tag != 0)  {continue;}
                        sero++;
                        tag = 1;
                }
                if(array[j][i] == 'X'){
                    tag=0;
                }
            }
        }

        for(int i=0; i<n; i++){
            tag = 0;
            for(int j=0; j<n-1; j++){
                if(array[i][j] == '.' && array[i][j+1]=='.'){
                    if(tag != 0) {continue;}
                        garo++;
                        tag = 1;
                }
                if(array[i][j] == 'X'){
                    tag=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char array[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            String line = sc.next();
            for (int j = 0; j < n; j++) {
                array[i][j] = line.charAt(j);
            }
        }
        find(n, array);
        System.out.println(garo+" "+sero);
    }


}

