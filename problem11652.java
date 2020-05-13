import java.io.*;
import java.util.*;
import java.math.*;

public class problem11652 {

    static long array[];
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        array = new long [n];
        int max=0;
        int count=1;
        long num=0;

        for(int i=0; i<n; i++){
            array[i] = sc.nextLong();
        }

        if(n==1){
            System.out.println(array[0]);
            return;
        }

        Arrays.sort(array);

        for(int i=0; i<n-1; i++){
            if(i == n-2){
                if(array[i] == array[i+1]){
                    count++;
                }
                if(max < count){
                    max = count;
                    num = array[i];
                    count = 1;
                }
                else if(max == count){
                    //num =  num - array[i]>0 ? num: array[i];
                    num = Math.min(num, array[i]);
                }
            }
            else if(array[i]==array[i+1]){
                count++;
            }
            else{
                if(max < count){
                    max = count;
                    num = array[i];
                    count = 1;
                }
                else if(max == count){
                    //num =  num - array[i]>0 ? num: array[i];
                    num = Math.min(num, array[i]);
                    max = count;
                    count = 1;
                }
                else {
                    count = 1;
                }
            }
        }

        System.out.println(num);

    }
}
