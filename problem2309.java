import java.util.*;
import java.io.*;

public class problem2309 {
    public static void main(String [] args){
        int array[] = new int [9];
        int sum = 0;
        int flag = 0;
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
            sum += array[i];
        }

        for(int i=0; i<array.length-1; i++){
            if(flag == 1){break;}
            for(int j =i+1; j<array.length; j++){
                if(sum - array[i] - array[j] == 100){
                        array[i] = 0;
                        array[j] = 0;
                        flag = 1;
                    break;
                }
            }
        }
        Arrays.sort(array);
        for(int k = 0; k<array.length; k++){
            if(array[k] != 0){
                System.out.println(array[k]);
            }
        }


    }
}
