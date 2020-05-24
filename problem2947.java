import java.io.*;
import java.util.*;

public class problem2947 {
    public static void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static boolean check(int []array){
        boolean flag = false;
        for(int i=0; i<5; i++){
            if(array[i] != (i+1)){
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void print(int []array){
        for(int i=0; i<5; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] array = new int [5];
        int tag=0;

        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }

        while(check(array)){
                if (array[0] > array[1]) {
                    swap(array, 0, 1);
                    print(array);
                }
                if (array[1] > array[2]) {
                    swap(array, 1, 2);
                    print(array);
                }
                if (array[2] > array[3]) {
                    swap(array, 2, 3);
                    print(array);
                }
                if (array[3] > array[4]) {
                    swap(array, 3, 4);
                    print(array);
                }
        }


    }
}
