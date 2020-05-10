import java.io.*;
import java.util.*;
import static java.util.Arrays.sort;

public class problem11652 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long []array = new long [n];
        long max=1;
        int count=1;
        long num=array[0];

        for(int i=0; i<n; i++){
            array[i] = sc.nextLong();
        }

        Arrays.sort(array);

        for(int i=0; i<n-1; i++){
            if(array[i]==array[i+1]){
                count++;
                if(count > max){
                    max = count;
                    num = array[i];
                }
            }
            else{
                count=1;
            }

           /* if(count==max){
                if(array[i]<0 && array[i-1]<0){
                    num = array[i];
                }
            }
            */

        }

        System.out.println(num);

    }
}
